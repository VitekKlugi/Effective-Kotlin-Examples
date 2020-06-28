package codedesign.item22

fun <T> copyWhenGreater(list: List<T>, threshold: T): List<String>
        where T : CharSequence,
              T : Comparable<T> {
    return list.filter { it > threshold }.map { it.toString() }
}

fun main() {
    val strings: List<String> = listOf("Ahoj", "Hoj", "oj")
    print(copyWhenGreater(strings, "G"))
}