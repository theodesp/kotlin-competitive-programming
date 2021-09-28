package competitive.programming.cs

/**
Given an array strings, determine whether it follows the sequence given in the patterns array.
In other words, there should be no i and j for which strings[i] = strings[j] and patterns[i] ≠ patterns[j] or
for which strings[i] ≠ strings[j] and patterns[i] = patterns[j].

Example

For strings = ["cat", "dog", "dog"] and patterns = ["a", "b", "b"], the output should be
areFollowingPatterns(strings, patterns) = true;
For strings = ["cat", "dog", "doggy"] and patterns = ["a", "b", "b"], the output should be
areFollowingPatterns(strings, patterns) = false.
 */

fun areFollowingPatterns(strings: MutableList<String>, patterns: MutableList<String>): Boolean {
    val strToPattern: HashMap<String, String> = hashMapOf()
    val patternToString: HashMap<String, String> = hashMapOf()
    for (i in strings.indices) {
        val str = strings[i];val pattern = patterns[i];
        if (!strToPattern.containsKey(str)) {
            strToPattern[str] = pattern
        }
        if (!patternToString.containsKey(pattern)) {
            patternToString[pattern] = str
        }
        if (strToPattern[str] != pattern || patternToString[pattern] != str) {
            return false
        }
    }
    return true
}
