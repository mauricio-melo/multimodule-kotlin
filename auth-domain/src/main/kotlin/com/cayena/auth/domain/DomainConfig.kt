package com.cayena.auth.domain

import com.cayena.auth.persistence.PersistenceConfig
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@ComponentScan(basePackages = ["com.cayena.auth.domain.service", "com.cayena.auth.domain.mapper"])
@Import(PersistenceConfig::class)
class DomainConfig