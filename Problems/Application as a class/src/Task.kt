class Application(val name: String) {
    fun run(args: Array<String>) {
        println(name)
        args.forEach(::println)
        }
}
