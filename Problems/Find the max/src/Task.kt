import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    var maxVal: Int = Int.MIN_VALUE
    var maxInd: Int = 0
    val n = scanner.nextInt()
    val arr = IntArray(n)
    for (i in 0..arr.lastIndex) {
        arr[i] = scanner.nextInt()
    }
    for (i in 0..arr.lastIndex) {
        if (arr[i] > maxVal) {
            maxVal = arr[i]
            maxInd = i
        }
    }
    println(maxInd)
}