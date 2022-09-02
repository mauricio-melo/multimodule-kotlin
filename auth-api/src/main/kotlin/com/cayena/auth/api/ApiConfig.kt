package com.cayena.auth.api

import com.cayena.auth.domain.DomainConfig
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@Import(DomainConfig::class)
class ApiConfig