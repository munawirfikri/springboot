package fikri.kotlinrestfulapi.entity

import java.util.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
data class User(
        @Id
        val id: String,
        @Column(name="username")
        val username: String,

        @Column(name="password")
        val password: String,

        @Column(name="name")
        val name: String,

        @Column(name="email")
        val email: String,

        @Column(name="address")
        val address: String?,

        @Column(name="created_at")
        val createdAt: Date?,

        @Column(name="updated_at")
        val updatedAt: Date?
)