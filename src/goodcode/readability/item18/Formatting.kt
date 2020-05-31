package goodcode.readability.item18

// classes with a short primary-constructor
class FullName(val name: String, val surname: String)

// classes with many parameters
open class Human()
class Person(
    val id: Int = 0,
    val name: String = "",
    val surname: String = ""
) : Human() {
    // body
}

// function with many parameters
public fun <T> Iterable<T>.joinToString(
    separator: CharSequence = ", ",
    prefix: CharSequence = "",
    postfix: CharSequence = "",
    limit: Int = -1,
    truncated: CharSequence = "...",
    transform: ((T) -> CharSequence)? = null
): String {
    return "Joined string."
}