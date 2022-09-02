package com.cayena.auth.persistence.service

import com.cayena.auth.persistence.entity.User
import com.cayena.auth.persistence.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserPersistence(
    val userRepository: UserRepository
) {

    fun findAll(): List<User> {
        return userRepository.findAll()
    }
}