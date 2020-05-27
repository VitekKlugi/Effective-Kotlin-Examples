package goodcode.readability.item11

data class Person(val isAdult: Boolean = true)
class View {
    fun showPerson(person: Person) = println(person)
    fun showError() = println("Error!")
    fun hideProgress() = println("Progress hidden.")
    fun hideProgressWithSuccess() = println("Progress hidden with success.")
}

fun main() {
    val person: Person? =
        Person()
    val view = View()

    // Implementation A
    if (person != null && person.isAdult) {
        view.showPerson(person)
    } else {
        view.showError()
    }

    // Implementation B - Kotlin idiomatic
    person?.takeIf { it.isAdult }   // safe call, takeIf
        ?.let(view::showPerson)     // bounded function reference
        ?: view.showError()         // Elvis operator
}

// Which one is better, A or B? - depends on how fast we can understand each of them