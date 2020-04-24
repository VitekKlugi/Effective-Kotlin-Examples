package goodcode.safety.item7

fun main() {
    val emptyList = listOf<Int>()
    val first = emptyList.getOrNull(0)

    print(first)
}