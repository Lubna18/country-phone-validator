package com.jumia.country.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

@TestConfiguration
public class DataSourceConfigTest {

    @Bean
    @Primary
    public DataSource dataSource() {
        return (DataSource) new DataSourceConfig();
    }
}
