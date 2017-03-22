package com.anders.cphbusiness.DB.DbConfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = {"com.anders.cphbusiness.Model.Repositories.PrimaryRepo"},
        entityManagerFactoryRef = "primaryEM",
        transactionManagerRef = "primaryTM")

public class LoadDataSourceConfig {
    @Bean(name = "primaryDS")
    @Primary
    @ConfigurationProperties(prefix = "datasource.primary")
    public DataSource loadingDataSource() {
        return DataSourceBuilder.create().build();
    }

    @PersistenceContext(unitName = "primaryPU")
    @Primary
    @Bean(name = "primaryEM")
    public LocalContainerEntityManagerFactoryBean loadingEntityManagerFactory(
            EntityManagerFactoryBuilder builder, @Qualifier("primaryDS") DataSource primaryDS) {
        return builder
                .dataSource(primaryDS)
                .persistenceUnit("primaryPU")
                .packages("com.anders.cphbusiness.Model.PrimaryModel")
                .build();
    }

    @Primary
    @Bean(name = "primaryTM")
    public PlatformTransactionManager transactionManager(
            @Qualifier("primaryEM") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }

}
