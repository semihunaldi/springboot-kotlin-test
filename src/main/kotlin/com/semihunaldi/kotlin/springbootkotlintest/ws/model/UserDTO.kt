package com.semihunaldi.kotlin.springbootkotlintest.ws.model

import com.semihunaldi.kotlin.springbootkotlintest.model.user.User

class UserDTO
{
    var id: String? = null
    var userName: String? = null
    var email: String? = null

    fun create(user: User): UserDTO {
        val userDTO = UserDTO()
        userDTO.id = user.getId()
        userDTO.userName = user.userName
        userDTO.email = user.email
        return userDTO
    }
}