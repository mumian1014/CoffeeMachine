import java.util.Scanner

enum class Rainbow(val color: String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet");
    companion object {
        fun isRainbow(color: String) = color in values().map { it.color.toLowerCase() }
    }
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    println(Rainbow.isRainbow(input.next()))
}