package com.example.demo.controller

import com.example.demo.dto.UserDto
import com.example.demo.service.UserService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class UsersController(
    val userService: UserService
) {

    @GetMapping("/users")
    fun getUsers(
        @RequestParam firstName: String,
        @PageableDefault(size = 20) pageable: Pageable
    ): Page<UserDto> {
        return userService.getUsersByFilter(firstName, pageable)
    }
}
