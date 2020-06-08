import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val str = scanner.next()
    var prevChar = str[0]
    var result = true
    for (i in 1 until str.length) {
        if (str[i] - 1 != prevChar) {
            result = false
            break
        }
        prevChar = str[i]
    }
    println(result)
}