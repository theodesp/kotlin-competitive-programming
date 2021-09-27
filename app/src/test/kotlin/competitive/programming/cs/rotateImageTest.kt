package competitive.programming.cs

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class RotateImageTest: StringSpec({
    "3x3" {
        rotateImage(mutableListOf(
            mutableListOf(1, 2, 3),
            mutableListOf(4, 5, 6),
            mutableListOf(7, 8, 9),
        )) shouldBe mutableListOf(
            mutableListOf(7, 4, 1),
            mutableListOf(8, 5, 2),
            mutableListOf(9, 6, 3),
        )
    }
    "1x1" {
        rotateImage(mutableListOf(
            mutableListOf(2),
        )) shouldBe mutableListOf(
            mutableListOf(2),
        )
    }
})