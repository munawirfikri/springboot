package fikri.kotlinrestfulapi.service.impl

import fikri.kotlinrestfulapi.entity.User
import fikri.kotlinrestfulapi.model.CreateUserRequest
import fikri.kotlinrestfulapi.model.UserResponse
import fikri.kotlinrestfulapi.repository.UserRepository
import fikri.kotlinrestfulapi.service.UserService
import org.springframework.stereotype.Service
import java.util.Date

@Service
class UserServiceImpl(val userRepository: UserRepository) : UserService {

    override fun create(createUserRequest: CreateUserRequest): UserResponse {
        val user = User(
                id = createUserRequest.id,
                username = createUserRequest.username,
                password = createUserRequest.password,
                name = createUserRequest.name,
                email = createUserRequest.email,
                address = createUserRequest.address,
                createdAt = Date(),
                updatedAt = null
        )

        userRepository.save(user)

        return UserResponse(
                id = user.id,
                username = user.username,
                email = user.email,
                address = user.address,
                createdAt = user.createdAt,
                updatetAt = user.updatedAt
                )
    }

}