package codedesign.classdesign.item37

fun String.parseNameTuple(): Pair<String, String>? {
    val indexOfLastSpace = this.trim().lastIndexOf(' ')
    if (indexOfLastSpace < 0) return null
    val firstName = this.take(indexOfLastSpace)
    val lastName = this.drop(indexOfLastSpace+1)
    return Pair(firstName, lastName)
}

data class Name(
    val name: String,
    val surname: String
)

fun String.parseName(): Name? {
    val indexOfLastSpace = this.trim().lastIndexOf(' ')
    if (indexOfLastSpace < 0) return null
    val firstName = this.take(indexOfLastSpace)
    val lastName = this.drop(indexOfLastSpace+1)
    return Name(firstName, lastName)
}

fun main() {
    val fullName = "Marcin Moskała"
    val (lastName, firstName) = fullName.parseNameTuple() ?: return
    println("His name is $firstName and surname is $lastName") // His name is Moskała

    val (surname, name) = fullName.parseName() ?: return // IDE Warning
    println("His name is $name and surname is $surname")
}