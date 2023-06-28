package fikri.kotlinrestfulapi.model

import java.util.Date

data class UserResponse (
        val id: String,
        val username: String,
        val email: String,
        val address: String?,
        val createdAt: Date?,
        val updatetAt: Date?
)