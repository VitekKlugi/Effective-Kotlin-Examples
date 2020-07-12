package codedesign.item24

class CovariantCup<out T>
open class Dog
class Puppy : Dog()

fun main() {
    val covariance: CovariantCup<Dog> = CovariantCup<Puppy>() // OK
//    val contravariance: CovariantCup<Puppy> = CovariantCup<Dog>() // Error - contravariance

    val anys: CovariantCup<Any> = CovariantCup<Int>() // OK
//    val nothings: CovariantCup<Nothing> = CovariantCup<Int>() //  Error
}