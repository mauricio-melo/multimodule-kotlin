package com.cayena.auth.persistence.entity

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.PrePersist
import javax.persistence.Table
import javax.validation.constraints.Email
import javax.validation.constraints.Size

@Entity
@Table(name = "users")
class UserEntity(

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
    @Column(name = "created_at", nullable = false, updatable = false)
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    val updatedAt: LocalDateTime = LocalDateTime.now(),
    ) {
    @PrePersist
    fun onCreateEntity() {
        this.publicId = UUID.randomUUID().toString()
    }
}