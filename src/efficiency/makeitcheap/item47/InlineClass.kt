package efficiency.makeitcheap.item47

inline // comment out, decompile and compare
class Name(private val value: String) { // try add another parameter
    fun greet() {
        print("Hello, I am $value")
    }
}

fun main() {
    val name = Name("Marcin")
    name.greet()
}