package codedesign.objectcreation.item35

data class SimplePerson(val age: Int)

class SimplePersonBuilder {
    var age = 0

    fun build(): SimplePerson = SimplePerson(age)
}

fun buildSimplePerson(init: SimplePersonBuilder.() -> Unit): SimplePerson {
    val builder = SimplePersonBuilder()
    builder.init()
    return builder.build()
}

fun main() {
    val person: SimplePerson = buildSimplePerson { // this: SimplePersonBuilder
        age = 42
    }
    println(person)
}
