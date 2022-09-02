package com.cayena.auth.persistence.repository

import com.cayena.auth.persistence.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>