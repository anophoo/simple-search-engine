import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val initial = scanner.next()
    val toArr = initial.split("-")
    print("${toArr[1]}/${toArr[2]}/${toArr[0]}")
}