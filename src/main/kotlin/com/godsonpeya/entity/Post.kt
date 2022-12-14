package com.godsonpeya.entity

import java.sql.Timestamp
import java.time.LocalDateTime

data class Post(
    var id: Long,
    var content: String,
    var userId: Long,
    var createdAt: Timestamp = Timestamp.valueOf(LocalDateTime.now()),
)