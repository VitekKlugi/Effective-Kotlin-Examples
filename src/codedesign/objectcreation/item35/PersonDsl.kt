package codedesign.objectcreation.item35

//@DslMarker
//annotation class PersonDsl

data class Person(val age: Int, val greeting: Greeting)
data class Greeting(val default: String, val specific: Map<String, String>? = null)

//@PersonDsl
class GreetingBuilder {
    var default: String = ""
//    private val specific = HashMap<String, String>()
//
//    infix fun String.to (target: String) {
//        specific[target] = this
//    }

    fun build(): Greeting = Greeting(default/**, specific**/)
}

//@PersonDsl
class PersonBuilder {
    var age: Int = 0
    private val greetingBuilder = GreetingBuilder()

    fun greeting(init: GreetingBuilder.() -> Unit) = greetingBuilder.init()

    fun build(): Person = Person(age, greetingBuilder.build())
}

fun buildPerson(init: PersonBuilder.() -> Unit): Person {
    val personBuilder = PersonBuilder()
    personBuilder.init()
    return personBuilder.build()
}

fun main() {
    val person: Person = buildPerson { // this: PersonBuilder
        age = 1
        greeting { // this: GreetingBuilder
//            "Hello" to "Father"
//            "Hi" to "Friend"
            default = "What's up"
//            age = 50
        }
    }

    println(person)
}