import java.util.*
import kotlin.io.println as println

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var (a, b, c, d) = arrayOf(0, 0, 0, 0)
    repeat(n) {
        when (scanner.nextInt()) {
            2 -> d++
            3 -> c++
            4 -> b++
            5 -> a++
        }
    }

    println("$d $c $b $a")
}