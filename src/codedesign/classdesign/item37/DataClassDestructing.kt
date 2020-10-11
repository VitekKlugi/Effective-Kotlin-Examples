package codedesign.classdesign.item37

data class FullName(
    val firstName: String,
    val secondName: String,
    val lastName: String
)

fun main() {
    val elon = FullName("Elon", "Reeve", "Musk")
    val (name, surname) = elon // rename surname to lastName
    print("It is $name $surname!") // It is Elon Reeve!
}
