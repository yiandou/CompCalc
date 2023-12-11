import com.ionspin.kotlin.bignum.decimal.toBigDecimal
import com.ionspin.kotlin.bignum.decimal.BigDecimal
import com.ionspin.kotlin.bignum.integer.toBigInteger
import com.ionspin.kotlin.bignum.integer.BigInteger
class Lexer {

    fun lex(input: String, whichCalc: String ): List<Any> {
        var lexin = input.toCharArray()
        var tokens = mutableListOf<Any>() //List that can be changed with elements of any type.
        val sbuf = StringBuilder() //A new string basically.
        var prevdigit = false //Boolean to check if the previous character was a digit.
        var prevop = false //Boolean to check if the previous character was an operator.
        var prevparen = false //Boolean to check if the previous character was a parenthesis.
        var prevfunc = false //Boolean to check if the previous character was a function.
        var mightDeriv = false //Boolean to see if it may be a derivative.
        when (whichCalc) {
            "Programming" -> {

            }
            "Scientific" -> {
                for (lex in lexin) {
                    if (lex.isDigit() || lex == '.') {
                        sbuf.append(lex) //Add the character to the string.
                        prevdigit = true
                    }
                    else if (prevdigit) {
                        tokens.add(sbuf.toString().toBigDecimal())
                        sbuf.clear() //Clears the string.
                        prevdigit = false

                    }
                    if (prevdigit) {/*do nothing*/}
                    else {

                    }

                }
            }
        }
        return input.toList()
    }
}