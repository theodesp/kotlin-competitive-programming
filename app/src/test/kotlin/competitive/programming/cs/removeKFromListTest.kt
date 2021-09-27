package competitive.programming.cs

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class removeKFromListTest: StringSpec({
    "some ks" {
        removeKFromList(makeListNode(arrayOf(3, 1, 2, 3, 4, 5)), 3) shouldBe makeListNode(arrayOf(1, 2, 4, 5))
    }
    "no ks" {
        removeKFromList(makeListNode(arrayOf(1, 2, 3, 4, 5, 6, 7)), 10) shouldBe makeListNode(arrayOf(1, 2, 3, 4, 5, 6, 7))
    }
    "all ks" {
        removeKFromList(makeListNode(arrayOf(1, 1, 1)), 1) shouldBe makeListNode(arrayOf())
    }
})