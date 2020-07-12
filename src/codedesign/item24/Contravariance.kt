package codedesign.item24

class ContravariantCup<in T>

fun main() {
//    val covariance: ContravariantCup<Dog> = ContravariantCup<Puppy>() // Error - covariance
    val contravariance: ContravariantCup<Puppy> = ContravariantCup<Dog>() // OK - contravariance

//    val anys: ContravariantCup<Any> = ContravariantCup<Int>() // Error - covariance
    val nothings: ContravariantCup<Nothing> = ContravariantCup<Int>() // OK - contravariance
}