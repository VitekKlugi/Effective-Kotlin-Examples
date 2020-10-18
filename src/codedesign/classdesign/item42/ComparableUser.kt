package codedesign.classdesign.item42

data class ComparableUser(
    val name: String,
    val surname: String
) : Comparable<ComparableUser> {
    override fun compareTo(other: ComparableUser): Int =
        compareValues(surname, other.surname)
//        compareValuesBy(this, other, { it.surname }, { it.name })
}

fun main() {
    val jan = ComparableUser("Jan", "Zrada")
    val adam = ComparableUser("Adam", "Zrada")

    println(jan < adam)
    println(jan > adam)
}