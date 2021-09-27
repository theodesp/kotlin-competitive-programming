package competitive.programming.cs

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class FirstNotRepeatingCharacterTest: StringSpec({
    "One repeating" {
        firstNotRepeatingCharacter("abacabad") shouldBe 'c'
    }
    "No repeating" {
        firstNotRepeatingCharacter("abacabaabacaba") shouldBe '_'
    }
    "Empty" {
        firstNotRepeatingCharacter("") shouldBe '_'
    }
})