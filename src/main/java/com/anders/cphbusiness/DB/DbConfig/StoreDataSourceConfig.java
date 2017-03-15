package com.anders.cphbusiness.DB.DbConfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
        basePackages = "com.anders.cphbusiness.Repositories.SecondaryRepo",
        entityManagerFactoryRef = "secondaryEM",
        transactionManagerRef = "secondaryTM")

public class StoreDataSourceConfig {

    @Bean(name = "secondaryDS")
    @ConfigurationProperties(prefix = "datasource.secondary")
    public DataSource storingDataSource() {
        return DataSourceBuilder.create().build();
    }

    @PersistenceContext(unitName = "secondaryPU")
    @Bean(name = "secondaryEM")
    public LocalContainerEntityManagerFactoryBean storingEntityManagerFactory(
            EntityManagerFactoryBuilder builder, @Qualifier("secondaryDS") DataSource secondaryDS) {
        return builder
                .dataSource(secondaryDS)
                .packages("com.anders.cphbusiness.Model.SecondaryModel")
                .persistenceUnit("secondaryPU")
                .build();
    }

    @Bean(name = "secondaryTM")
    public PlatformTransactionManager secondaryTransactionManager(
            @Qualifier("secondaryEM") EntityManagerFactory secondaryEM) {
        return new JpaTransactionManager(secondaryEM);
    }
}
