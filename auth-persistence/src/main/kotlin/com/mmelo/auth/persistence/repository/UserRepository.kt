package com.mmelo.auth.persistence.repository

import com.mmelo.auth.persistence.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface UserRepository : JpaRepository<UserEntity, Long> {
    fun findByUsernameIgnoreCase(email: String): Optional<UserEntity>
    fun findByPhoneNumber(phoneNumber: String): Optional<UserEntity>
}