package com.godsonpeya.entity

import java.sql.Timestamp
import java.time.LocalDateTime

/**
 * l'entite publication (post)
 */
data class Post(
    var id: Long,
    var content: String,
    var userId: Long,
    var createdAt: Timestamp = Timestamp.valueOf(LocalDateTime.now()),
)