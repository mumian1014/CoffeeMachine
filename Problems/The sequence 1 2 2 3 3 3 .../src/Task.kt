import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var result = ""
    for (i in 1..n) {
        result += create(i)
    }
    println(result.substring(0, n * 2))
}

fun create(num: Int): String {
    var result = ""
    for (i in 1..num) {
        result += " $num"
    }
    return result
}
