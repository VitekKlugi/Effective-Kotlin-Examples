package goodcode.safety.item1

private val name: String? = "Márton"
private val surname: String = "Braun"

// non-final property - custom getter
private val fullName: String?
    get() = name?.let { "$it $surname" }

// final property
private val fullName2: String? = name?.let { "$it $surname" }

fun main() {
    if (fullName != null) {
//        println(fullName.length) // ERROR
    }

    if (fullName2 != null) {
        println(fullName2.length) // Márton Braun
    }
}