package com.cayena.auth.api.mapper

import com.cayena.auth.api.controller.response.UserResponseDTO
import com.cayena.auth.domain.service.dto.UserDTO
import org.mapstruct.Mapper

@Mapper
interface UserResponseMapper {
    fun mapToUserResponseDTOBy(userDTO: UserDTO): UserResponseDTO
}