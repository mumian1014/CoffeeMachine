class Site {
    var address: String
    var foundationYear: Int
    constructor(address: String, foundationYear:Int) {
        this.address = address
        this.foundationYear = foundationYear
    }

}

fun makeReddit(): Site {
    return Site("reddit.com", foundationYear = 2005)
}


//fun main() {
//    val site: Site = Site()
//    val makeReddit = site.makeReddit()
//    println(makeReddit.address)
//    println(makeReddit.foundationYear)
//}