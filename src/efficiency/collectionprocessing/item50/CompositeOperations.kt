package efficiency.collectionprocessing.item50

class Student(val name: String? = null)

// refactor - use Idea hints
fun List<Student>.getNames(): List<String> = this
    .map { it.name }
    .filter { it != null }
    .map { it!! }

fun main() {
    val students = listOf(Student("Karel"), Student(), Student("Lenka"))
    println(students.getNames())
}