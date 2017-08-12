package com.semihunaldi.kotlin.springbootkotlintest.ws

import com.semihunaldi.kotlin.springbootkotlintest.services.UserService
import com.semihunaldi.kotlin.springbootkotlintest.ws.model.UserDTO
import lombok.Setter
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.annotation.Resource

@RestController
class UserWebServiceController
{
    @Setter
    @Resource(name = "userService")
    private val userService: UserService? = null

    @RequestMapping(value = "/user/createUser", method = arrayOf(RequestMethod.POST))
    @ResponseStatus(value = HttpStatus.OK)
    fun queryUserByEmail(@RequestParam(value = "email", defaultValue = "") email: String): UserDTO
    {
        try
        {
            val user = userService!!.findUserByEmail(email)
            //TODO
        }
        catch (e : Exception)
        {

        }
        return UserDTO()
    }
}