import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val k = scanner.nextInt()
    val arr = IntArray(k)
    for (i in 0 until k) {
        arr[i] = scanner.nextInt()
    }
    val n = scanner.nextInt()
    val m = scanner.nextInt()

    var output = "YES"
    if (k > 1) {
        for (i in 0 until (k - 1)) {
            if (arr[i] == n && arr[i + 1] == m || arr[i] == m && arr[i + 1] == n) {
                output = "NO"
                break
            }
        }
    }
    println(output)
}