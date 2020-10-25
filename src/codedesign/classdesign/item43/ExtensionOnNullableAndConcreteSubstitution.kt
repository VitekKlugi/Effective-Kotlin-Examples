package codedesign.classdesign.item43

fun main() {
    val nullableChars: CharSequence? = null
    println(nullableChars.isNullOrBlank())

    val chars: CharSequence = "hello"
    println(chars.isNullOrBlank()) // see IDE warning

    // concrete substitution of a generic type
    val numbers = listOf(1,2,3)
    println(numbers.sum())

    val strings = listOf("1", "2", "3")
//    println(strings.sum()) // ERROR
}