import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var result: String = "$n"
    var t = n
    while (t > 1) {
        if (t % 2 == 0) {
            t /= 2
            result += " $t"
        } else {
            t = t * 3 + 1
            result += " $t"
        }
    }
    println(result)
}
