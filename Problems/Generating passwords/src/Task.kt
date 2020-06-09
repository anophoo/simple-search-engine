import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val uppercase = scanner.nextInt()
    val lowercase = scanner.nextInt() + uppercase
    val digits = scanner.nextInt() + lowercase
    val total = scanner.nextInt()

    val res = CharArray(total)

    for (i in 0 until uppercase) {
        res[i] = 'A' + i % 26
    }
    for (i in uppercase until lowercase) {
        res[i] = 'a' + i % 26
    }
    for (i in lowercase until digits) {
        res[i] = '0' + i % 10
    }
    for (i in digits until total) {
        res[i] = '{' + i
    }

    println(String(res))
}