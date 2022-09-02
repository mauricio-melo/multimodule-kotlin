package com.cayena.auth.persistence.entity

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.Size

@Entity
@Table(name = "users")
class User(

    @Id
    @Email
    @Column(updatable = false, nullable = false, unique = true)
    val username: String = "",

    @Column(nullable = false)
    val name: String = "",

    @Column(unique = true, updatable = false, nullable = false)
    var publicId: String = "",

    @Size(min = 0, max = 500)
    val password: String = "",

    @Column(nullable = false, unique = true)
    val phoneNumber: String = "",

    @Column(nullable = false)
    val enabled: Boolean = true,

    @Column(nullable = false)
    val passwordChangeRequired: Boolean = true,

    @CreationTimestamp
    @Column(name = "created_at", columnDefinition = "DATETIME", nullable = false, updatable = false)
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @UpdateTimestamp
    @Column(name = "updated_at", columnDefinition = "DATETIME", nullable = false)
    val updatedAt: LocalDateTime = LocalDateTime.now(),


    ) {
    @PrePersist
    fun onCreateEntity() {
        this.publicId = UUID.randomUUID().toString()
    }
}