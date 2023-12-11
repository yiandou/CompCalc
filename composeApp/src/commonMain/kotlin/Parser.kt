import com.ionspin.kotlin.bignum.decimal.BigDecimal
import com.ionspin.kotlin.bignum.integer.BigInteger

class Parser {
    fun parse(command: String inputs: List<Any>) {
        for (input in inputs) {
            if (input is BigDecimal || input is BigInteger) {
                println(input)
            }
            else if (input is String) {
                println(input)
            }
            else {
                return "Error: Invalid input."
            }
        }
    }
}