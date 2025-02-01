package com.example.demo.service

import com.example.demo.dto.UserDto
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageImpl
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import kotlin.math.min

@Service
class UserService {
    val users: List<UserDto> = listOf(
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
        UserDto(id = 1, firstName = "Иван", lastName = "Иванов"),
    )

    fun getUsers(pageable: Pageable): Page<UserDto> {
        val offset = pageable.pageSize * pageable.pageNumber
        return PageImpl(
            users.subList(min(offset, users.size), min(offset + pageable.pageSize, users.size)),
            pageable,
            users.size.toLong()
        )
    }
}
