package fikri.kotlinrestfulapi.model

import java.util.Date

data class CreateUserRequest (
        val id: String,
        val username: String,
        val password: String,
        val name: String,
        val email: String,
        val address: String?,
        val createdAt: Date?,
        val updatedAt: Date?
)