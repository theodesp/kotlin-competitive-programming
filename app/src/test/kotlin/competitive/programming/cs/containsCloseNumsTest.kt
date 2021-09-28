package competitive.programming.cs

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class containsCloseNumsTest: StringSpec({
    "is true" {
        containsCloseNums(mutableListOf(0, 1, 2, 3, 5, 2), 3) shouldBe true
    }

    "is false" {
        containsCloseNums(mutableListOf(0, 1, 2, 3, 5, 2), 2) shouldBe false
    }
})