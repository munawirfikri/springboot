package fikri.kotlinrestfulapi.service

import fikri.kotlinrestfulapi.model.CreateUserRequest
import fikri.kotlinrestfulapi.model.UserResponse

interface UserService {
    fun create(createUserRequest: CreateUserRequest) : UserResponse
}