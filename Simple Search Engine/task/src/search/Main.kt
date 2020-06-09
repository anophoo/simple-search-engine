package search

import java.util.*

/**
 * First, the user should input a number N, which indicates the number of lines with data that will be entered next.
 * Then the user enters N lines of data.
 * After that, the user enters a number M (number of search queries).
 * After each query, the program should print the information found among the data.
 */
fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter the number of people:")
    val lines = scanner.nextLine().toInt()
    val data: Array<String?> = arrayOfNulls(lines);

    println("Enter all people:")
    for (i in data.indices) data[i] = scanner.nextLine()!!

    println("\nEnter the number of search queries:")
    val queries = scanner.nextLine().toInt()

    repeat(queries) {
        println("\nEnter data to search people:")
        val term = scanner.nextLine()!!.toUpperCase()
        var isFirstResult = true
        var isFoundInAnyLine = false
        for (line in data) {
            var isFoundInLine = false
            for (word in line!!.split(" ")) {
                if (word.toUpperCase().contains(term)) {
                    isFoundInLine = true
                    isFoundInAnyLine = true
                    break
                }
            }
            if (isFoundInLine && isFirstResult) {
                println("\nFound people:")
                isFirstResult = false
            }
            if (isFoundInLine) println(line)
        }
        if (!isFoundInAnyLine) println("No matching people found.")
    }
}