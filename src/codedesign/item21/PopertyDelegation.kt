package codedesign.item21

import kotlin.reflect.KProperty

var token: String? by LoggingProperty(null)
var attempts: Int by LoggingProperty(0)

class Car(name: String) { // data class?
    val name by LoggingProperty(name)
}

private class LoggingProperty<T>(var value: T) {
    operator fun getValue(
        thisRef: Any?,
        prop: KProperty<*>
    ): T {
        println("${prop.name} returned value $value, thisRef=${thisRef}")
        return value
    }

    operator fun getValue(
        car: Car,
        prop: KProperty<*>
    ): T {
        println("${prop.name} returned car = $value, thisRef=${car}")
        return value
    }

    operator fun setValue(
        thisRef: Any?,
        prop: KProperty<*>,
        newValue: T
    ) {
        val name = prop.name
        println("$name changed from $value to $newValue")
        value = newValue
    }
}

fun main() {
    token
    attempts
    token = "Ahoj"
    attempts = 2
    val car = Car("Skoda")
    car.name
}