package goodcode.safety.item1

// Notice though that read-only properties are not necessarily immutable nor final.

private var name: String = "Marcin"
private var surname: String = "Moskała"
private val fullName
    get() = "$name $surname"

fun main() {
    println(fullName) // Marcin Moskała
    name = "Maja"
    println(fullName) // Maja Moskała
}