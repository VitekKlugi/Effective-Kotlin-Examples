package goodcode.readability.item12

//infix fun Int.timesRepeated(operation: () -> Unit) = repeat(this) { operation() }

fun main() {
    repeat(3) { print("Hello") }

    // If we want to keep their usage operator-like, we can make them infix
//    3 timesRepeated { print("Hello") }
}