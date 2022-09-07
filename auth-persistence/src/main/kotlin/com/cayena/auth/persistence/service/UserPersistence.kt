package com.cayena.auth.persistence.service

import com.cayena.auth.persistence.entity.UserEntity
import com.cayena.auth.persistence.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class UserPersistence(
    val repository: UserRepository
) {
    fun findAll(): List<UserEntity> = repository.findAll()

    fun findByUsername(username: String): Optional<UserEntity> = repository.findByUsernameIgnoreCase(username)

    fun findByUsernameEnabled(username: String): Optional<UserEntity> =
        repository.findByUsernameIgnoreCaseAndEnabledIsTrue(username)

    fun findByPhoneNumber(phoneNumber: String): Optional<UserEntity> = repository.findByPhoneNumber(phoneNumber)

    fun findByPublicId(publicId: String): Optional<UserEntity> = repository.findByPublicId(publicId)
}