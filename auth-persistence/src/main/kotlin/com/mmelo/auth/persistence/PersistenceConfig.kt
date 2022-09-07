package com.mmelo.auth.persistence

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = ["com.mmelo.auth.persistence.service"])
@EnableAutoConfiguration
class PersistenceConfig