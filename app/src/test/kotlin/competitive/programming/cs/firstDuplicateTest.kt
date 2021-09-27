package competitive.programming.cs

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.should
import io.kotest.matchers.string.startWith

class FirstDuplicateTest : StringSpec({
    "One duplicate" {
        firstDuplicate(mutableListOf(2, 1, 3, 5, 3, 2)) shouldBe 3
    }
    "No duplicates" {
        firstDuplicate(mutableListOf(2, 4, 3, 5, 1)) shouldBe -1
    }
    "Empty" {
        firstDuplicate(mutableListOf()) shouldBe -1
    }
})