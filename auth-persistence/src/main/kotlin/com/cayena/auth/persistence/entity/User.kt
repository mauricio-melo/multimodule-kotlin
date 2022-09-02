package com.cayena.auth.persistence.entity

import com.cayena.auth.persistence.enumerator.ProfileType
import javax.persistence.*

@Entity
@Table(name = "users")
class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idt_user")
    var id: Long? = null,

    @Column(name = "name", nullable = false)
    val name: String = "",

    @Column(name = "profile", nullable = false)
    @Enumerated(EnumType.STRING)
    val profile: ProfileType = ProfileType.MASTER
)