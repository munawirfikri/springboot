package fikri.kotlinrestfulapi.repository

import fikri.kotlinrestfulapi.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, String>