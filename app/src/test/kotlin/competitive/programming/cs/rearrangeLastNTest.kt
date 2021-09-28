package competitive.programming.cs

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class rearrangeLastNTest: StringSpec({
    "1st" {
        rearrangeLastN(makeListNode(arrayOf(1, 2, 3, 4, 5)), 3) shouldBe makeListNode(arrayOf(3, 4, 5, 1, 2))
    }
    "2nd" {
        rearrangeLastN(makeListNode(arrayOf(1, 2, 3, 4, 5, 6, 7)), 1) shouldBe makeListNode(arrayOf(7, 1, 2, 3, 4, 5, 6))
    }
})