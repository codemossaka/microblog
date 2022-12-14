package com.godsonpeya.repository

import com.godsonpeya.bd.Database.POSTS
import com.godsonpeya.entity.Post

class PostRepository : JpaRepository<Post, Long> {

    override fun save(e: Post): Int {
        POSTS.add(e)
        return 1
    }

    override fun findBy(id: Long): Post? = POSTS.firstOrNull { post -> post.id == id }


    override fun findAll(): List<Post> = POSTS

    fun findAllBy(userId: Long): List<Post> = POSTS.filter { post -> post.userId == userId }

}