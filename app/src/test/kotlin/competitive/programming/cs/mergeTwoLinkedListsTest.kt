package competitive.programming.cs

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class mergeTwoLinkedListsTest: StringSpec({
    "same length" {
        mergeTwoLinkedLists(makeListNode(arrayOf(1, 2, 3)), makeListNode(arrayOf(4,5,6))) shouldBe makeListNode(arrayOf(1, 2, 3, 4, 5 ,6))
    }

    "different lengths" {
        mergeTwoLinkedLists(makeListNode(arrayOf(1, 1, 2, 4)), makeListNode(arrayOf(0, 3, 5))) shouldBe makeListNode(arrayOf(0, 1, 1, 2, 3, 4, 5))
    }
})