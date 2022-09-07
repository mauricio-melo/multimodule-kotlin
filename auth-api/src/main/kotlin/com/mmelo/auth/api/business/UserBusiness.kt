package com.mmelo.auth.api.business

import com.mmelo.auth.api.controller.response.UserResponseDTO
import com.mmelo.auth.api.mapper.UserResponseMapper
import com.mmelo.auth.domain.service.UserService
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
            .orElseThrow{ RuntimeException("user not found") }
    }
}