package com.godsonpeya.service

import com.godsonpeya.entity.User
import com.godsonpeya.repository.UserRepository

class UserService(private val userRepository: UserRepository = UserRepository()) {

    fun inscription(user: User): String {
        if (user.fullname != null && user.password != null) {
            val userSaved = userRepository.save(user)
            return "Utilisateur cree"
        }
        throw IllegalArgumentException("Les donnees ne sont pas valides")
    }

    fun connexion(username: String, password: String): User {
        val userFound = userRepository.findByUsername(username)
        if (userFound != null && userFound.password == password) {
            return userFound
        }

        throw IllegalArgumentException("Ce compte n'existe pas!")

    }
}