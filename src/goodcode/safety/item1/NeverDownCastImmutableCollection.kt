package goodcode.safety.item1

val list = listOf(1, 2, 3)

fun main() {
    // DON’T DO THIS! - use toMutableList
    if (list is MutableList) {
        list.add(4)
    }
}