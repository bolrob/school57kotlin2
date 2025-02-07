package com.example.demo.repository

import com.example.demo.entity.UserEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.NativeQuery
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository

interface UserRepository
    : JpaRepository<UserEntity, Long>,
    PagingAndSortingRepository<UserEntity, Long> {

        fun findByFirstName(firstName: String, pageable: Pageable): Page<UserEntity>
}
