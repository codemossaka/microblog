package com.godsonpeya.bd

import com.godsonpeya.entity.Post
import com.godsonpeya.entity.User

object Database {
    val POSTS: MutableList<Post> = mutableListOf(
        Post(id = 1,
            content = "1 Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusamus animi culpa facere illum itaque laborum libero magni officiis. Accusantium commodi corporis debitis fugit ipsum sapiente tenetur? Aspernatur dolorem eligendi laudantium?",
            userId = 1),
        Post(id = 2,
            content = "2 Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusamus animi culpa facere illum itaque laborum libero magni officiis. Accusantium commodi corporis debitis fugit ipsum sapiente tenetur? Aspernatur dolorem eligendi laudantium?",
            userId = 1),
        Post(id = 3,
            content = "3 Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusamus animi culpa facere illum itaque laborum libero magni officiis. Accusantium commodi corporis debitis fugit ipsum sapiente tenetur? Aspernatur dolorem eligendi laudantium?",
            userId = 2)
    )
    val USERS: MutableList<User> = mutableListOf(
        User(id = 1,
            username = "demo",
            profession = "Dev",
            ville = "Moscow",
            pays = "Russia",
            fullname = "Demo User",
            password = "password",
            posts = mutableListOf(Post(id = 1,
                content = "1 Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusamus animi culpa facere illum itaque laborum libero magni officiis. Accusantium commodi corporis debitis fugit ipsum sapiente tenetur? Aspernatur dolorem eligendi laudantium?",
                userId = 1),
                Post(id = 2,
                    content = "2 Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusamus animi culpa facere illum itaque laborum libero magni officiis. Accusantium commodi corporis debitis fugit ipsum sapiente tenetur? Aspernatur dolorem eligendi laudantium?",
                    userId = 1))
        ),
        User(id = 2,
            username = "admin",
            profession = "Admin",
            ville = "Bielarussie",
            pays = "Gomel",
            fullname = "Admin User",
            password = "password",
            posts = mutableListOf(
                Post(id = 3,
                content = "2 Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusamus animi culpa facere illum itaque laborum libero magni officiis. Accusantium commodi corporis debitis fugit ipsum sapiente tenetur? Aspernatur dolorem eligendi laudantium?",
                userId = 2)
            )
        ),
        User(id = 3,
            username = "guest",
            profession = "Guest",
            ville = "Bielarussie",
            pays = "Gomel",
            fullname = "Guest User",
            password = "password",
        )
    )
}