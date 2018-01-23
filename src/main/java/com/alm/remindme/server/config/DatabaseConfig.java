package com.alm.remindme.server.config;

import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

@Configuration
@EnableJpaRepositories("com.alm.remindme.server.repository")
@EnableTransactionManagement
@ComponentScan("com.alm.remindme.server")
@PropertySource("classpath:db.properties")
public class DatabaseConfig {
    @Resource
    private Environment env;

}
