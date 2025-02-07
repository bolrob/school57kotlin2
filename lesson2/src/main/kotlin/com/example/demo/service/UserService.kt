package com.example.demo.service

import com.example.demo.dto.UserDto
import com.example.demo.entity.mapToDto
import com.example.demo.repository.UserRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class UserService(
    val userRepository: UserRepository,
) {

    fun getUsersByFilter(firstName: String, pageable: Pageable): Page<UserDto> {
        return userRepository.findByFirstName(firstName, pageable)
            .map { userEntity -> userEntity.mapToDto() }
    }
}
