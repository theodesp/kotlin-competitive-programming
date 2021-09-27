package competitive.programming.cs

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class isListPalindromeTest: StringSpec({
    "palindrome" {
        isListPalindrome(makeListNode(arrayOf(0, 1, 0))) shouldBe true
    }
    "non palindrome" {
        isListPalindrome(makeListNode(arrayOf(1, 2, 2, 3))) shouldBe false
    }
})