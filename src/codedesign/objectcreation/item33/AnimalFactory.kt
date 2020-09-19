package codedesign.objectcreation.item33

interface Animal

abstract class AnimalFactory {
    abstract fun create(): Animal

    fun transport(animal: Animal, destination: String) {
        print("Transporting $animal to $destination")
    }
}

class Cat: Animal {
    companion object CatFactory: AnimalFactory() {
        override fun create(): Animal {
            return Cat()
        }
    }
}

fun main() {
    val cat = Cat.create()
    Cat.transport(cat, "Domů")
}