package competitive.programming.cs

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe


class swapLexOrderTest: StringSpec({
    "simple" {
        swapLexOrder("abdc", mutableListOf(
            mutableListOf(1,4),
            mutableListOf(3,4)
        )) shouldBe "dbca"
    }
})