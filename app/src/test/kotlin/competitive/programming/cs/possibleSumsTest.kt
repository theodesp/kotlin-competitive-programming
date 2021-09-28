package competitive.programming.cs

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class possibleSumsTest: StringSpec({
    "3 numbers" {
        possibleSums(mutableListOf(10, 50, 100), mutableListOf(1, 2, 1)) shouldBe 9
    }
})