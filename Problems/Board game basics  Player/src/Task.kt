import java.util.Random
import Player as Player

class Player(val id: Int, val name: String, val hp: Int) {
    companion object Properties {
        fun create(name: String): Player {
            val random = Random()
            val id = random.nextInt(10) + 100
            return Player(id, name, 50)
        }
    }
}

