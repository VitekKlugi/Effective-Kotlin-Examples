package goodcode.safety.item2

private enum class Color {BLUE, YELLOW, RED}

// Bad
fun printWeatherBad(degrees: Int) {
    val description: String
    val color: Color
    if (degrees < 5) {
        description = "cold"
        color = Color.BLUE
    } else if (degrees < 23) {
        description = "mild"
        color = Color.YELLOW
    } else {
        description = "hot"
        color = Color.RED
    }

    println("Description: $description, color: $color")
}

// Better
fun printWeather(degrees: Int) {
    val (description, color) = when {
        degrees < 5 -> "cold" to Color.BLUE
        degrees < 23 -> "mild" to Color.YELLOW
        else -> "hot" to Color.RED
    }

    println("Description: $description, color: $color")
}

fun main() {
    printWeatherBad(5)
    printWeather(5)
}