package com.godsonpeya.entity

import java.sql.Timestamp
import java.time.LocalDateTime

/**
 * L'entite utilisateur (user)
 */
data class User(
    var id: Long,
    var username: String,
    var profession: String,
    var ville: String,
    var pays: String,
    var fullname: String,
    var password: String,
    var posts: MutableList<Post> = mutableListOf(),
    var createdAt: Timestamp = Timestamp.valueOf(LocalDateTime.now()),
    var updatedAt: Timestamp? = null,
)