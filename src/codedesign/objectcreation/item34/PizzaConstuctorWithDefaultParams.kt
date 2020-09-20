package codedesign.objectcreation.item34

data class Pizza(
    val size: String,
    val cheese: Int = 0,
    val olives: Int = 0,
    val bacon: Int = 0
)

fun main() {
    println(Pizza("L"))
    println(Pizza("L", bacon = 1))
    println(Pizza("L", bacon = 1, olives = 3))
    println(Pizza("XL",1,2,3))
}