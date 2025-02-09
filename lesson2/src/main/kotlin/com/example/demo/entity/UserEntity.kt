package com.example.demo.entity

import com.example.demo.dto.UserDto
import jakarta.persistence.*

@Entity
@Table(name = "users")
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    val firstName: String,
    val lastName: String,
)

/**
 * Конвертируем entity в dto.
 */
fun UserEntity.mapToDto(): UserDto =  UserDto(
    id = id,
    firstName = firstName,
    lastName = lastName
)
