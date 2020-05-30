package goodcode.readability.item12

fun Int.factorial(): Int = (1..this).product()
fun Iterable<Int>.product(): Int = fold(1) { acc, i -> acc * i }
//operator fun Int.not() = factorial()

fun main() {
    println(3.factorial())

    // can we achieve mathematical expression 3!
//    println(!3) // should we do that?
}