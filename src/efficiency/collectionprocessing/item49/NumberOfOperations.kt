package efficiency.collectionprocessing.item49

fun main() {
    println("Sequence:")
    val sequenceResult = (1..10).asSequence()
        .filter { print("F$it, "); it % 2 == 1 }
        .map { print("M$it, "); it * 2 }
        .find { it > 5 }
    println("Result = $sequenceResult")

    println("List:")
    val listResult = (1..10)
        .filter { print("F$it, "); it % 2 == 1 }
        .map { print("M$it, "); it * 2 }
        .find { it > 5 }
    println("Result = $listResult")
}