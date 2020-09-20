package codedesign.objectcreation.item35

data class MutablePerson ( var age: Int = 0 )

fun MutablePerson.defineAge() { // this: MutablePerson
    this.age = 43
}

fun buildMutablePerson(init: MutablePerson.() -> Unit): MutablePerson {
    val person = MutablePerson()
    person.init()
    return person
}

fun main() {
    // step 1 - extension function
    val person = MutablePerson()
    person.defineAge()
    println(person)

    // step 2 - using builder function - passing extension function (lambda) to another function
    val youngerPerson = buildMutablePerson { age = 34 }
    println(youngerPerson)
}