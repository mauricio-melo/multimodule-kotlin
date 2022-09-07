package com.mmelo.auth.persistence.service

import com.mmelo.auth.persistence.entity.UserEntity
import com.mmelo.auth.persistence.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class UserPersistence(
    val repository: UserRepository
) {
    fun findAll(): List<UserEntity> = repository.findAll()

    fun findByUsername(username: String): Optional<UserEntity> = repository.findByUsernameIgnoreCase(username)

    fun findByPhoneNumber(phoneNumber: String): Optional<UserEntity> = repository.findByPhoneNumber(phoneNumber)

    fun findById(id: Long): Optional<UserEntity> = repository.findById(id)
}