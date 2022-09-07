package com.cayena.auth.api.controller

import com.cayena.auth.api.controller.response.UserResponseDTO
import com.cayena.auth.api.business.UserBusiness
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(
    val business: UserBusiness
) {

    @GetMapping
    fun findAll(): List<UserResponseDTO> = business.findAll()

    @GetMapping(path = ["/{username}"])
    fun findAll(@PathVariable username: String): UserResponseDTO = business.findByUsername(username)
}