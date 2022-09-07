package com.cayena.auth.api.business

import com.cayena.auth.api.controller.response.UserResponseDTO
import com.cayena.auth.api.mapper.UserResponseMapper
import com.cayena.auth.domain.service.UserService
import org.springframework.stereotype.Service

@Service
class UserBusiness(
    val service: UserService,
    val mapper: UserResponseMapper
) {

    fun findAll(): List<UserResponseDTO> = service.findAll().map { mapper.mapToUserResponseDTOBy(it) }

    fun findByUsername(username: String): UserResponseDTO {
        return service.findByUsername(username)
            .map { mapper.mapToUserResponseDTOBy(it) }
            .orElseThrow{ RuntimeException() }
    }
}