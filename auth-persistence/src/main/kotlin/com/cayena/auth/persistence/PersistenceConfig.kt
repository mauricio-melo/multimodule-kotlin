package com.cayena.auth.persistence

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@Configuration
@ComponentScan(basePackages = ["com.cayena.auth.persistence.service"])
@EnableTransactionManagement
@EnableAutoConfiguration
@EnableJpaRepositories
class PersistenceConfig