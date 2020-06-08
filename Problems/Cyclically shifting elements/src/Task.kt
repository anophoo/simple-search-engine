import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    var arr = IntArray(n)
    for (i in 1 until n) {
        arr[i] = scanner.nextInt()
    }
    arr[0] = scanner.nextInt()
    for (i in arr) {
        print("${i} ")
    }
    println()
}