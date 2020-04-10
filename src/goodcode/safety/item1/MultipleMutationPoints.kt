package goodcode.safety.item1

import kotlin.properties.Delegates

private val list1 = mutableListOf<Int>() // mutating point in the collection - faster, maybe thread safer, based on underlying impl
var list2 = listOf<Int>() // mutation point is the var - we have it under control
//    private set // setter the only mutation point

//private var list2 by Delegates.observable(listOf<Int>()) { _, old, newVal ->
//    println("Changed from $old to $newVal")
// }

//private var list2 = mutableListOf<Int>() // never do that!

fun main() {
    list1.add(1)
    list2 += 1

    list1 += 2 // list1.plusAssign(2)
    list2 += 2

    print(list1)
    print(list2)
}