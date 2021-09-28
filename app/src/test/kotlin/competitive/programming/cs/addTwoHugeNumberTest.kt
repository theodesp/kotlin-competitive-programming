package competitive.programming.cs

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class addTwoHugeNumberTest : StringSpec({
    "Same size" {
        addTwoHugeNumbers(makeListNode(arrayOf(123, 4, 5)), makeListNode(arrayOf(100, 100, 100))) shouldBe makeListNode(arrayOf(223, 104, 105))
    }

    "different size" {
        addTwoHugeNumbers(makeListNode(arrayOf(9876, 5432, 1999)), makeListNode(arrayOf(1, 8001))) shouldBe makeListNode(arrayOf(9876, 5434, 0))
    }
})