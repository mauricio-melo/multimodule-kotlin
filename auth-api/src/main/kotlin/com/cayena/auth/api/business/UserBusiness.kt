package com.cayena.auth.api.business

import com.cayena.auth.api.controller.response.UserResponseDTO
import com.cayena.auth.domain.service.UserService
import org.springframework.stereotype.Service

@Service
class UserBusiness(
    val userService: UserService
) {

    fun findAll(): List<UserResponseDTO> {
        return userService.findAll()
            .map {
                UserResponseDTO(
                    id = it.id,
                    name = it.name,
                    profile = it.profile
                )
            }
    }
}