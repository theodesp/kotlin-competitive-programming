package competitive.programming.cs

fun main(args: Array<String>) {
    println(centuryFromYear(99)) // 1
    println(centuryFromYear(100)) // 1
    println(centuryFromYear(2001)) // 21
    println(centuryFromYear(2000)) // 20
    println(centuryFromYear(1905)) // 20
}

/*
Given a year, return the century it is in.
The first century spans from the year 1 up to and including the year 100, the second - from the year 101 up to and including the year 200, etc.

Example

For year = 1905, the output should be
centuryFromYear(year) = 20;
For year = 1700, the output should be
centuryFromYear(year) = 17.
 */

/*
 Solution: https://www.geeksforgeeks.org/find-century-year/
 */
fun centuryFromYear(year: Int): Int {
    val (rem, div) = arrayOf(year % 100, year / 100)
    return when(rem) {
        0 -> div
        else -> div + 1
    }
}
