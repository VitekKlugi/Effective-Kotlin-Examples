package codedesign.classdesign.item37

data class User(val name: String)

fun main() {
    val user = User("John")
    user.let { a -> println(a) } // User(name=John)

    // Don't do that
    user.let { (a) -> println(a) } // John
}