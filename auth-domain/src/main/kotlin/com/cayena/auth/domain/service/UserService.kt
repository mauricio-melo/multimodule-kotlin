package com.cayena.auth.domain.service

import com.cayena.auth.domain.service.dto.UserDTO
import com.cayena.auth.persistence.service.UserPersistence
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userPersistence: UserPersistence
) {

    fun findAll(): List<UserDTO> {
        return userPersistence.findAll()
            .map {
                UserDTO(
                    username = it.username,
                    name = it.name,
                    phoneNumber = it.phoneNumber
                )
            }
    }
}