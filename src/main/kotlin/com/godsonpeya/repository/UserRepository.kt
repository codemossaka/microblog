package com.godsonpeya.repository

import com.godsonpeya.bd.Database.USERS
import com.godsonpeya.entity.User

/**
 * la couche d'accès aux données
 */
class UserRepository : JpaRepository<User, Long> {
    override fun save(e: User): Int {
        USERS.add(e)
        return 1
    }

    override fun findBy(id: Long): User? = USERS.firstOrNull { user -> user.id == id }

    override fun findAll(): List<User> = USERS

    fun findByUsername(username: String): User? {
        return USERS.firstOrNull { user -> user.username == username }
    }
}