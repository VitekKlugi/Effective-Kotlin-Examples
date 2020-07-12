package codedesign.reusability.item24

interface Animal
interface Cutie
data class Young(val name: String) : Animal, Cutie
data class Lion(val name: String) : Animal
data class Cat(val name: String) : Cutie

fun fillWithYoung(list: MutableList<in Young>) {
    list.add(Young("Jim"))
    list.add(Young("Beam"))
//    val first: Young = list.get(0) // Any? - try change variance modifier to out
}

fun main() {
    val lions = mutableListOf<Animal>(Lion("Elsa"))
    fillWithYoung(lions)
    println(lions)


    val animals = mutableListOf<Cutie>(Cat("Felix"))
    fillWithYoung(animals)
    println(animals)
}
