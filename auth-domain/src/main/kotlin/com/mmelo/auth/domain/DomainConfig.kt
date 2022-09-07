package com.mmelo.auth.domain

import com.mmelo.auth.persistence.PersistenceConfig
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@ComponentScan(basePackages = ["com.mmelo.auth.domain.service", "com.mmelo.auth.domain.mapper"])
@Import(PersistenceConfig::class)
class DomainConfig