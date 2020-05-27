package goodcode.readability.item11

fun main() {
    val person: Person? =
        Person()
    val view = View()

    // Implementation A
    if (person != null && person.isAdult) {
        view.showPerson(person)
        view.hideProgressWithSuccess()
    } else {
        view.showError()
        view.hideProgress()
    }

    // Implementation B - Kotlin idiomatic
    person?.takeIf { it.isAdult }
        ?.let {
            // view::showPerson - can't be used
            view.showPerson(it)
            view.hideProgressWithSuccess()
        }
        ?: run { // run added
            view.showError()
            view.hideProgress()
        }
}

// Have you noticed that implementation A and B do not even work the same way? - demonstrate on CognitiveLoad