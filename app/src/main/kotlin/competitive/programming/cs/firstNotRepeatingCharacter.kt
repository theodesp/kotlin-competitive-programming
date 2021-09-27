package competitive.programming.cs

/**
Given a string s consisting of small English letters,
find and return the first instance of a non-repeating character in it.
If there is no such character, return '_'.

Example

For s = "abacabad", the output should be
firstNotRepeatingCharacter(s) = 'c'.

There are 2 non-repeating characters in the string: 'c' and 'd'.
Return c since it appears in the string first.

For s = "abacabaabacaba", the output should be
firstNotRepeatingCharacter(s) = '_'.

There are no characters in this string that do not repeat.

https://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/
 */

fun firstNotRepeatingCharacter(s: String): Char {
    val freq = s.groupingBy { it }.eachCount()
    for (i in s.indices) {
        if (freq[s[i]] == 1) {
            return s[i]
        }
    }

    return '_'
}
