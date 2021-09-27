package competitive.programming.cs

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class isCryptSolutionTest: StringSpec({
    "Has Solution" {
        isCryptSolution(mutableListOf("SEND", "MORE", "MONEY"), mutableListOf(
            mutableListOf('O', '0'),
            mutableListOf('M', '1'),
            mutableListOf('Y', '2'),
            mutableListOf('E', '5'),
            mutableListOf('N', '6'),
            mutableListOf('D', '7'),
            mutableListOf('R', '8'),
            mutableListOf('S', '9'),
        )) shouldBe true
    }
    "Hasn't got solution" {
        isCryptSolution(mutableListOf("TEN", "TWO", "ONE"), mutableListOf(
            mutableListOf('O', '1'),
            mutableListOf('T', '0'),
            mutableListOf('W', '9'),
            mutableListOf('E', '5'),
            mutableListOf('N', '4'),
        )) shouldBe false
    }
    "Edge Case 1" {
        isCryptSolution(mutableListOf("AAAAAAAAAAAAAA", "BBBBBBBBBBBBBB", "CCCCCCCCCCCCCC"), mutableListOf(
            mutableListOf('A', '1'),
            mutableListOf('B', '2'),
            mutableListOf('C', '3'),
        )) shouldBe false
    }
})