package fikri.kotlinrestfulapi.controller

import fikri.kotlinrestfulapi.model.CreateUserRequest
import fikri.kotlinrestfulapi.model.UserResponse
import fikri.kotlinrestfulapi.model.WebResponse
import fikri.kotlinrestfulapi.service.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController (val userService: UserService) {

    @PostMapping(
            value = ["/api/user/register"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )

    fun registerUser(@RequestBody body: CreateUserRequest): WebResponse<UserResponse>{
        val userResponse = userService.create(body)

        return WebResponse(200, "success", userResponse)
    }

}