package com.example.demo.controller

import com.example.demo.dto.UserDto
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageImpl
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UsersController {

    @GetMapping("/users")
    fun getUsers(
        @PageableDefault(size = 20) pageable: Pageable
    ): Page<UserDto> {
        println("Page: ${pageable.pageNumber}")
        println("Size: ${pageable.pageSize}")
        println("Sort: ${pageable.sort.toString()}")
        return PageImpl(
            listOf(
                UserDto(id = 1, firstName = "Иван", lastName = "Иванов")
            )
        )
    }
}
