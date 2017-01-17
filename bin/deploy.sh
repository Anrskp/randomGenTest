#!/bin/bash

if [ $# -ne 2 ]; then
    echo $0: usage: deploy.sh name version
    exit 1
fi

name=$1
version=$2
image="registry.dsservice.eu:5000/danskespil/rngCheck:${version}"

if [ ${name} == "rngCheck-prod" ]; then
 export DOCKER_HOST=tcp://swarm1-master.dsservice.eu:2376
 export DOCKER_CERT_PATH=/var/jenkins_home/.docker/swarm1-
master.dsservice.eu
 export DOCKER_TLS_VERIFY=1
 replicas=3
 profile="dev"
else
 export DOCKER_HOST=tcp://swarm2-master.dsservice.eu:2376
 export DOCKER_CERT_PATH=/var/jenkins_home/.docker/swarm2-
master.dsservice.eu
 export DOCKER_TLS_VERIFY=1
 replicas=1
 profile="dev"
fi

if [ ${name} == "rngCheck-prod" ]; then
 virtual_hostname="feeds.dsservice.eu"
 profile="dev"
fi

if [ ${name} == "rngCheck-ci" ]; then
 virtual_hostname="feeds.ci.dsservice.eu"
 dburl=jdbc:sqlserver://adaserver.database.windows.net:1433;database=ADAcopy;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;
 dbuser=anrskp@adaserver
 dbpassword=11Hvaderder
 replicas=3
fi

if [ -z "$virtual_hostname" ]; then
 echo "Stopping Deployment service name invalid"
 exit 1
fi

## check if the service is running
docker service ls -f name=${name} | grep " ${name} " > /dev/null 2>&1 if [ $? -eq 0 ]; then
    echo "The service ${name} is running on the Swarm cluster, going to update it now with image ${image}"
    docker service update --image ${image} ${name}
    docker service inspect --pretty ${name} else
    echo "The service ${name} is not running on the Swarm cluster, going to create it now with image ${image}"
    docker service create \
            -e SERVICE_PORTS="8080" \
            --name ${name} \
            --publish :8080 \
            --replicas ${replicas} \
            --network proxyy \
            --env VIRTUAL_HOST=${virtual_hostname} \
            --env SPRING_PROFILES_ACTIVE=${profile} \
            --update-delay 25s \
            --env spring.datasource.url=$dburl \
            --env spring.datasource.username=$dbuser \
            --env spring.datasource.password=$dbpassword \
            ${image}
fi
