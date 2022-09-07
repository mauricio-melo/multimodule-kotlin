package com.mmelo.auth.persistence.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
class UserEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idt_user")
    val id: Long = 1L,

    @Column(name = "username", nullable = false, unique = true, updatable = false)
    val username: String = "",

    @Column(name = "phoneNumber", nullable = false)
    val phoneNumber: String = ""
)