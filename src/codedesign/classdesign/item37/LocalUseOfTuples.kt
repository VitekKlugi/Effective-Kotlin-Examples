package codedesign.classdesign.item37

fun main() {
    // when we immediately name values
    val degrees = 15
    val (description, color) = when {
        degrees < 5 -> "cold" to "BLUE"
        degrees < 23 -> "mild" to "YELLOW"
        else -> "hot" to "RED"
    }

    println("$description, $color")

    // to represent an aggregate not known in advance
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    val (odd, even) = numbers.partition { it % 2 == 1 }

    println(odd)
    println(even)

    val map = mapOf(1 to "Vienna", 2 to "Prague", 3 to "Bratislava", 4 to "Berlin")

    println(map)
}
