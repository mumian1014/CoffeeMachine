fun main() {
    val input = readLine()!!
    var result = ""
    when {
        input.startsWith("i") -> {
            result = input.substring(1)
            val next = Integer.parseInt(result) + 1;
            println(next)
        }
        input.startsWith("s") -> {
            val next = input.substring(1)
            result = next.reversed()
            println(result)
        }
        else -> {
            println(input)
        }
    }
}