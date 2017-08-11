package com.semihunaldi.kotlin.springbootkotlintest.dao.user

import com.semihunaldi.kotlin.springbootkotlintest.model.user.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface UserRepository : JpaRepository<User,Long>
{
    @Query("select user from User user")
    abstract fun findAllUsers(): List<User>

    @Query("select user from User user where user.email=:email")
    abstract fun findUserByEmail(@Param("email") email: String): User

    @Query("select user from User user where user.id=:id ")
    abstract fun findUserById(@Param("id") id: Long): User

    @Query("select user from User user where user.userName=:userName")
    abstract fun findUserByUserName(@Param("userName") userName: String): User
}
