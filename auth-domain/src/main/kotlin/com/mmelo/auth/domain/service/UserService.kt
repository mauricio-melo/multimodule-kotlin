package com.mmelo.auth.domain.service

import com.mmelo.auth.domain.service.dto.UserDTO
import com.mmelo.auth.domain.mapper.UserMapper
import com.mmelo.auth.persistence.service.UserPersistence
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class UserService(
    private val persistence: UserPersistence,
    private val mapper: UserMapper
) {
    fun findAll(): List<UserDTO> = persistence.findAll().map { mapper.mapToUserDTOBy(it) }

    fun findByUsername(username: String): Optional<UserDTO> =
        persistence.findByUsername(username).map { mapper.mapToUserDTOBy(it) }

    fun findByPhoneNumber(phoneNumber: String): Optional<UserDTO> =
        persistence.findByPhoneNumber(phoneNumber).map { mapper.mapToUserDTOBy(it) }

    fun findById(id: Long): Optional<UserDTO> =
        persistence.findById(id).map { mapper.mapToUserDTOBy(it) }
}