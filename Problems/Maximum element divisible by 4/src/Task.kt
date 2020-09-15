import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    var max = 0
    repeat(n) {
        val next = scanner.nextInt()
        if (next % 4 == 0 && max < next) {
            max = next
        }
    }
    println(max)
}