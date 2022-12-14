package com.godsonpeya

import com.godsonpeya.service.PostService
import com.godsonpeya.service.UserService

/**
 * couche de présentation qui fait appel aux couches de traitement des utilisateurs et publications  (userService, postService)
 */
fun main(args: Array<String>) {


    val userService = UserService() // couche de traitement
    val postService = PostService() //couche de traitement


    while (true) {

        println("Connectez-vous!")

        println("Votre username (ou appuyez sur I pour s'inscrire si vous n'avez pas de compte): ")

        val username = readln()

        if (username.equals("i", true)) {

//            userService.inscription() //todo a implementer
        } else {
            println("Saisissez le mot de passe: ")
            val password = readln()

            val user = userService.connexion(username = username, password = password)

            println(
                """
                   1. Appuyez (P) pour faire une publication
                   2. Appuyez (L) pour lister vos publications
                """.trimIndent()
            )

            when (readln().uppercase()) {
                "P" -> {
                    println("Saisissez votre publication")
                    val post = postService.createPost(content = readln(), userId = user.id)
                    user.posts.add(post)
                    println(user)
                }
                "L" -> {

                }
            }


        }


    }
}