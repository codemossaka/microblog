package com.godsonpeya.repository

/**
 * L'interface contenant la liste des methodes basiques que doivent avoir tous les repositories
 */
interface JpaRepository<E, T> {
    fun save(e: E): Int
    fun findBy(id: T): E?
    fun findAll(): List<E>
}