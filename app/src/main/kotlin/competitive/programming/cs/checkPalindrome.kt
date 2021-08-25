package competitive.programming.cs

fun main(args: Array<String>) {
    println(checkPalindrome("aabaa")) // true
    println(checkPalindrome("abac")) // false
    println(checkPalindrome("a")) // true
    println(checkPalindrome("az")) // false
}

/*
https://www.geeksforgeeks.org/c-program-check-given-string-palindrome/
 */
fun checkPalindrome(input: String): Boolean {
    var (lo,hi) = listOf(0, input.length-1)
    while(hi >= 1) {
        if (input[lo] != input[hi]) {
            return false
        }
        lo++
        hi--
    }
    return true
}