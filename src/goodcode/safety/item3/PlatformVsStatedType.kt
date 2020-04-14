package goodcode.safety.item3

fun main() {
    val value = JavaClass().value // platform type
//    val value: String = JavaClass().value // stated type
    print(value.length)
}