import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val input = scanner.next().toLowerCase()
    val arr = input.split("a", "e", "i", "o", "u", "y")
    val arr2 = input.split( "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z")
    var result = 0
    for (e in arr) {
//        print(" -$e- ")
        result += (e.length - 1) / 2
    }
    for (e in arr2) {
//        print(" -$e- ")
        result += (e.length - 1) / 2
    }
    println(result)
}