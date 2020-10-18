package codedesign.classdesign.item42

data class User(val name: String, val surname: String)

fun main() {
    val names = listOf(
        User("Jan", "Zrada"),
        User("Adam", "Zrada"),
        User("Karel", "Brambora")
    )

    println(names.sortedBy { it.surname })
    println(names.sortedWith(compareBy({ it.surname }, { it.name })))
}