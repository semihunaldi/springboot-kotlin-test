package com.semihunaldi.kotlin.springbootkotlintest.ws.model

import com.semihunaldi.kotlin.springbootkotlintest.model.user.User
import com.semihunaldi.kotlin.springbootkotlintest.ws.BaseResult

class UserDTO : BaseResult
{
    var id: String? = null
    var userName: String? = null
    var email: String? = null

    constructor()
    {

    }

    constructor(errorCode: Int, errorDescription: String?) : super(errorCode, errorDescription)

    fun create(user: User): UserDTO {
        val userDTO = UserDTO()
        userDTO.id = user.getId()
        userDTO.userName = user.userName
        userDTO.email = user.email
        return userDTO
    }
}