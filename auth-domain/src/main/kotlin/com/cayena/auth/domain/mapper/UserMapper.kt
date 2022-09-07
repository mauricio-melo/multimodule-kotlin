package com.cayena.auth.domain.mapper

import com.cayena.auth.domain.service.dto.UserDTO
import com.cayena.auth.persistence.entity.UserEntity
import org.mapstruct.Mapper

@Mapper
interface UserMapper {
    fun mapToUserDTOBy(userEntity: UserEntity): UserDTO
}