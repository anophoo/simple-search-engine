fun main() {
    var password: String? = null
    val searchParams = readLine()!!.substringAfter("?").split("&")
        .map { it.split("=", limit = 2) }
        .toMutableList()

    searchParams.forEach { (key, value) ->
        if (key == "pass" && value.isNotEmpty()) {
            password = value
        }

        println("$key : ${if (value.isNotEmpty()) value else "not found"}")
    }

    if (password != null) {
        println("password : $password")
    }
}