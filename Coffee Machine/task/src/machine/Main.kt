package machine

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var water = 400
    var milk = 540
    var beans = 120
    var cups = 9
    var money = 550

    printConversation()
    loop@ while(scanner.hasNext()) {
        val ope = scanner.next();
        when (ope) {
            "buy" -> {
                print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappccino:")
                val menu = scanner.next()
                when (menu) {
                    "1" -> {
                        val result = buyEspresso(water, milk, beans, cups)
                        if (result.startsWith("I")) {
                            water -= 250
                            beans -= 16
                            money += 4
                            cups -= 1
                        }
                        println(result)
                        printConversation()
                    }
                    "2" -> {
                        val result = buyEspresso(water, milk, beans, cups)
                        if (result.startsWith("I")) {
                            water -= 350
                            beans -= 20
                            milk -= 75
                            money += 7
                            cups -= 1
                        }

                        println(result)
                        printConversation()
                    }
                    "3" -> {
                        val result = buyCappcino(water, milk, beans, cups)
                        if (result.startsWith("I")) {
                            water -= 200
                            beans -= 12
                            milk -= 100
                            money += 6
                            cups -= 1
                        }
                        println(result)
                        printConversation()
                    }
                    "back" -> {
                        continue@loop
                        printConversation()
                    }
                }
            }
            "fill" -> {
                print("Write how many ml of water do you want add:")
                water += scanner.nextInt()
                print("Write how many ml of milk do you want add:")
                milk += scanner.nextInt()
                print("Write how many grams of coffee beans do you want add:")
                beans += scanner.nextInt()
                print("Write how many disposable cups of coffee do you want:")
                cups += scanner.nextInt()
                printConversation()
            }
            "take" -> {
                val dispMoney = "$" + money
                println("I gave you $dispMoney")
                money -= money
                printConversation()
           }
            "exit" -> {
                break@loop
            }
            "remaining" -> {
                remaining(water, milk, beans, cups, money)
                printConversation()
            }
        }
    }
}

fun printConversation () {
    print("Write action (buy, fill, take, remaining, exit):")
}

fun remaining(water:Int, milk:Int, beans:Int, cups:Int, money:Int) {
    println("The coffee machine has:")
    println("$water of water")
    println("$milk of milk")
    println("$beans of coffee beans")
    println("$cups of disposable cups")
    println("$money of money")
}

fun buyEspresso(water:Int, milk:Int, beans:Int, cups:Int): String {
    var notEnough = ""
    if (water < 250) {
        notEnough += "water"
    }

    if (beans < 16) {
        notEnough += "beans"
    }

    if (cups < 1) {
        notEnough += "cups"
    }
    return createOrderResult(notEnough)
}

fun buyLatte(water:Int, milk:Int, beans:Int, cups:Int): String {
    var notEnough = ""
    if (water < 350) {
        notEnough += "water"
    }

    if (beans < 20) {
        notEnough += "beans"
    }

    if (milk < 75) {
        notEnough += "milk"
    }

    if (cups < 1) {
        notEnough += "cups"
    }
    return createOrderResult(notEnough)
}

fun buyCappcino(water: Int, milk:Int, beans:Int, cups: Int): String {
    var notEnough = ""
    if (water < 200) {
        notEnough += "water"
    }

    if (beans < 12) {
        notEnough += "beans"
    }

    if (milk < 100) {
        notEnough += "milk"
    }

    if (cups < 1) {
        notEnough += "cups"
    }
    return createOrderResult(notEnough)
}

fun createOrderResult(notEnough:String): String {
    var result = ""
    if (notEnough.isEmpty()) {
        result = "I have enough resources, making you a coffee!"
    } else {
        result = "Sorry not enough $notEnough!"
    }

    return result
}