package com.godsonpeya.service

import com.godsonpeya.bd.Database.POSTS
import com.godsonpeya.entity.Post
import com.godsonpeya.repository.PostRepository

/**
 * La couche de traitement des publication qui fait appel a la couche d'accès aux données  postRepository
 */
class PostService(private val postRepository: PostRepository = PostRepository()) {


    fun getAllPost(): List<Post> = postRepository.findAll()

    fun createPost(content: String, userId: Long): Post {
        if (content != "") {
            val post = Post(id = POSTS.size + 1L, content = content, userId = userId)
            postRepository.save(post)
            return post
        }
        throw IllegalArgumentException("Les donnees ne sont pas valides")
    }

    fun getPostsByUser(userId: Long):List<Post> = postRepository.findAllBy(userId)

}