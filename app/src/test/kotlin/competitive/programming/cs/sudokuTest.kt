package competitive.programming.cs

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class sudokuTest: StringSpec({
    "Valid" {
        sudoku2(mutableListOf(
            mutableListOf('.', '.', '.', '1', '4', '.', '.', '2', '.'),
            mutableListOf('.', '.', '6', '.', '.', '.', '.', '.', '.'),
            mutableListOf('.', '.', '.', '.', '.', '.', '.', '.', '.'),
            mutableListOf('.', '.', '1', '.', '.', '.', '.', '.', '.'),
            mutableListOf('.', '6', '7', '.', '.', '.', '.', '.', '9'),
            mutableListOf('.', '.', '.', '.', '.', '.', '8', '1', '.'),
            mutableListOf('.', '3', '.', '.', '.', '.', '.', '.', '6'),
            mutableListOf('.', '.', '.', '.', '.', '7', '.', '.', '.'),
            mutableListOf('.', '.', '.', '5', '.', '.', '.', '7', '.'),
        )) shouldBe true
    }
    "Invalid" {
        sudoku2(mutableListOf(
            mutableListOf('.', '.', '.', '.', '2', '.', '.', '9', '.'),
            mutableListOf('.', '.', '.', '.', '6', '.', '.', '.', '.'),
            mutableListOf('7', '1', '.', '.', '7', '5', '.', '.', '.'),
            mutableListOf('.', '7', '.', '.', '.', '.', '.', '.', '.'),
            mutableListOf('.', '.', '.', '.', '8', '3', '.', '.', '.'),
            mutableListOf('.', '.', '8', '.', '.', '7', '.', '6', '.'),
            mutableListOf('.', '.', '.', '.', '.', '2', '.', '.', '.'),
            mutableListOf('.', '1', '.', '2', '.', '.', '.', '.', '.'),
            mutableListOf('.', '2', '.', '.', '3', '.', '.', '.', '.'),
        )) shouldBe false
    }
})