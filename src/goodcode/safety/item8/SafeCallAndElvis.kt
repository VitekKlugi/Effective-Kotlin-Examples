package goodcode.safety.item8

data class Printer(val name: String)

fun main() {
    val printer: Printer? = null

    val printerName1 = printer?.name ?: "Unnamed"
//    val printerName2 = printer?.name ?: return
//    val printerName3 = printer?.name ?: throw Error("Printer must be named")

    print(printerName1)
}