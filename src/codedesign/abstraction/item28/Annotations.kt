package codedesign.abstraction.item28

import java.io.InputStream

// @Experimental(level = Experimental.Level.WARNING)
@RequiresOptIn(level = RequiresOptIn.Level.WARNING)
annotation class ExperimentalNewApi

@ExperimentalNewApi
fun getUsers(): List<String> = listOf()

@Deprecated("getAllUsers() is depracated use getUsers() instead.", ReplaceWith("getUsers()"))
fun getAllUsers(): List<String> = listOf()

fun main() {
    getUsers()

//    getAllUsers()
}