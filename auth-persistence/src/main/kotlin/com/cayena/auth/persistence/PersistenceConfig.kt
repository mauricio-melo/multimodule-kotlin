package com.cayena.auth.persistence

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = ["com.cayena.auth.persistence.service"])
@EnableAutoConfiguration
class PersistenceConfig