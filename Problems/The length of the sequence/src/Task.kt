import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var count = 0
    do {
        val n = scanner.nextInt()
        count++
    } while (n >= 1)
    println(count - 1)
}
