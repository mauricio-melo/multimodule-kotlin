package com.mmelo.auth.domain.mapper

import com.mmelo.auth.domain.service.dto.UserDTO
import com.mmelo.auth.persistence.entity.UserEntity
import org.mapstruct.Mapper

@Mapper
interface UserMapper {
    fun mapToUserDTOBy(userEntity: UserEntity): UserDTO
}