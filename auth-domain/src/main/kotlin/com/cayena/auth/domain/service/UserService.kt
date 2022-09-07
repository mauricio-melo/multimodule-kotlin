package com.cayena.auth.domain.service

import com.cayena.auth.domain.service.dto.UserDTO
import com.cayena.auth.domain.mapper.UserMapper
import com.cayena.auth.persistence.service.UserPersistence
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

    fun findByUsernameEnabled(username: String): Optional<UserDTO> =
        persistence.findByUsernameEnabled(username).map { mapper.mapToUserDTOBy(it) }

    fun findByPhoneNumber(phoneNumber: String): Optional<UserDTO> =
        persistence.findByPhoneNumber(phoneNumber).map { mapper.mapToUserDTOBy(it) }

    fun findByPublicId(publicId: String): Optional<UserDTO> =
        persistence.findByPublicId(publicId).map { mapper.mapToUserDTOBy(it) }
}