package com.mmelo.auth.api.mapper

import com.mmelo.auth.api.controller.response.UserResponseDTO
import com.mmelo.auth.domain.service.dto.UserDTO
import org.mapstruct.Mapper

@Mapper
interface UserResponseMapper {
    fun mapToUserResponseDTOBy(userDTO: UserDTO): UserResponseDTO
}