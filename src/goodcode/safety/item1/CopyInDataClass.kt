package goodcode.safety.item1

data class Person(val firstName: String, val surname: String)

fun main() {
    val myName = Person("Vítek", "Kluganost")
    val vitekPavelec = myName.copy(surname = "Pavelec")
    print(vitekPavelec)
}