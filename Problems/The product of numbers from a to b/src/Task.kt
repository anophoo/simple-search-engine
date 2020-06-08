import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var product: Long = 1
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    for (i in a until b) {
        product *= i
    }
    println(product)
}