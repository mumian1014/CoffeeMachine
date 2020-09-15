import java.util.Scanner

enum class CurrencyEnm(val type: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar"),
    UNKNOWN("");

    companion object {
        fun findCountry(countryName: String): CurrencyEnm {
            for (enum in values()) {
                if (countryName == enum.name) return enum
            }
            return UNKNOWN
        }
    }

    fun getCurrencyType(): String {
        return type
    }
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val firstCountry = CurrencyEnm.findCountry(input.next())
    val secondCountry = CurrencyEnm.findCountry(input.next())
    println(firstCountry.getCurrencyType() == secondCountry.getCurrencyType())
}