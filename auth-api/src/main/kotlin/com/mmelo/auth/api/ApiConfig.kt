package com.mmelo.auth.api

import com.mmelo.auth.domain.DomainConfig
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@Import(DomainConfig::class)
class ApiConfig