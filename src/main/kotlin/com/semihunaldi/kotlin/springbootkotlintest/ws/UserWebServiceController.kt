package com.semihunaldi.kotlin.springbootkotlintest.ws

import com.semihunaldi.kotlin.springbootkotlintest.model.user.User
import com.semihunaldi.kotlin.springbootkotlintest.services.UserService
import com.semihunaldi.kotlin.springbootkotlintest.ws.model.UserDTO
import lombok.Setter
import org.springframework.web.bind.annotation.*
import javax.annotation.Resource

@RestController(value = "/api/user")
class UserWebServiceController
{
    @Setter
    @Resource(name = "userService")
    private val userService: UserService? = null

    @RequestMapping(value = "queryUserByEmail", method = arrayOf(RequestMethod.GET))
    //http://localhost:8080/api/user/queryUserByEmail?email=test@test.com
    fun queryUserByEmail(@RequestParam(value = "email", defaultValue = "") email: String): UserDTO
    {
        try
        {
            val user : User = userService!!.findUserByEmail(email)
            var userDTO = UserDTO()
            userDTO.email = user.email
            userDTO.userName = user.userName
            userDTO.id = user.getId()
            return userDTO
        }
        catch (e : Exception)
        {
            return UserDTO(-1, e.message)
        }
    }
}