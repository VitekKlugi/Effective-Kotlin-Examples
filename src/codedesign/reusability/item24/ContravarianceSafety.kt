package codedesign.reusability.item24

open class Car
interface Boat
class Amphibious : Car(), Boat

fun getAmphibious(): Amphibious = Amphibious()

class CarBox<in T> {
    private var value: T? = null // illegal in Kotlin at public out postition

    fun set(value: T) {
        this.value = value
    }

    private fun get(): T = value ?: error("Value not set")
}

fun main() {
    val car: Car = getAmphibious()
    val boat: Boat = getAmphibious()

    val garage: CarBox<Car> = CarBox()
    garage.set(Car())
    val amphibiousSpot: CarBox<Amphibious> = garage
//    val boat2: Boat = garage.value // But I only have a Car

    val noSpot: CarBox<Nothing> = CarBox<Car>()
//    val boat3: Nothing = noSpot.value // I cannot produce Nothing!
}