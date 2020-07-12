package codedesign.reusability.item24

class Hound : Dog()

fun takeDog(dog: Dog) {}

class DogBox<out T> {
    private var value: T? = null // public in position prohibited - remove private

    // Illegal in Kotlin
    private fun set(value: T) {
        this.value = value
    }

    fun get(): T = value ?: error("Value not set")
}

fun main() {
    // implicit upcasting
    takeDog(Dog())
    takeDog(Puppy())
    takeDog(Hound())

    val puppyBox = DogBox<Puppy>()
    val dogBox: DogBox<Dog> = puppyBox
//    dogBox.set(Hound()) // But I have a place for a Puppy

    val dogHouse = DogBox<Dog>()
    val box: DogBox<Any> = dogHouse
//    box.set("Some string") // But I have a place for a Dog
//    box.set(42) // But I have a place for a Dog
}