package com.cayena.auth.api.controller

import com.cayena.auth.api.controller.response.UserResponseDTO
import com.cayena.auth.api.business.UserBusiness
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(
    val userBusiness: UserBusiness
) {
    @GetMapping
    fun findAll(): List<UserResponseDTO> {
        return userBusiness.findAll()
    }
}