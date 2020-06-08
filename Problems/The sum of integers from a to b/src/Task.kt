import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var sum = 0
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    for (i in a..b) {
        sum += i
    }
    println(sum)
}