import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val url = scanner.next() + "&"
    val pass = if (url.indexOf("pass=") != -1) url.substringAfter("pass=").substringBefore("&") else ""
    val port = if (url.indexOf("port=") != -1) url.substringAfter("port=").substringBefore("&") else ""
    val cookie = if (url.indexOf("cookie=") != -1) url.substringAfter("cookie=").substringBefore("&") else ""
    val host = if (url.indexOf("host=") != -1) url.substringAfter("host=").substringBefore("&") else ""
    if (pass.isNotEmpty()) {
        println("pass : $pass")
    }
    if (port.isNotEmpty()) {
        println("port : $port")
    } else {
        println("port : not found")
    }
    if (cookie.isNotEmpty()) {
        println("cookie : $cookie")
    } else {
        println("cookie : not found")
    }
    if (host.isNotEmpty()) {
        println("host : $host")
    } else {
        println("host : not found")
    }
    if (pass.isNotEmpty()) {
        println("password : $pass")
    }
}