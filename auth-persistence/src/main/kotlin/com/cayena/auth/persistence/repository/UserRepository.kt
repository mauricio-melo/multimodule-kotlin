package com.cayena.auth.persistence.repository

import com.cayena.auth.persistence.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface UserRepository : JpaRepository<UserEntity, Long> {
    fun findByUsernameIgnoreCaseAndEnabledIsTrue(email: String): Optional<UserEntity>
    fun findByUsernameIgnoreCase(email: String): Optional<UserEntity>
    fun findByPhoneNumber(phoneNumber: String): Optional<UserEntity>
    fun findByPublicId(publicId: String): Optional<UserEntity>
}