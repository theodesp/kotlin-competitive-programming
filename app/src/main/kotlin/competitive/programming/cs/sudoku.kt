package competitive.programming.cs

import competitive.programming.Helpers
import io.kotest.assertions.all
import io.kotest.data.blocking.forAll

/**
Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with numbers in such a way that
each column, each row, and each of the nine 3 × 3 sub-grids that compose the grid all contain all of
the numbers from 1 to 9 one time.

Implement an algorithm that will check whether the given grid of numbers represents a valid
Sudoku puzzle according to the layout rules described above. Note that the puzzle represented by grid does not have to be solvable.

Example

For

grid = [['.', '.', '.', '1', '4', '.', '.', '2', '.'],
['.', '.', '6', '.', '.', '.', '.', '.', '.'],
['.', '.', '.', '.', '.', '.', '.', '.', '.'],
['.', '.', '1', '.', '.', '.', '.', '.', '.'],
['.', '6', '7', '.', '.', '.', '.', '.', '9'],
['.', '.', '.', '.', '.', '.', '8', '1', '.'],
['.', '3', '.', '.', '.', '.', '.', '.', '6'],
['.', '.', '.', '.', '.', '7', '.', '.', '.'],
['.', '.', '.', '5', '.', '.', '.', '7', '.']]
the output should be
sudoku2(grid) = true;

For

grid = [['.', '.', '.', '.', '2', '.', '.', '9', '.'],
['.', '.', '.', '.', '6', '.', '.', '.', '.'],
['7', '1', '.', '.', '7', '5', '.', '.', '.'],
['.', '7', '.', '.', '.', '.', '.', '.', '.'],
['.', '.', '.', '.', '8', '3', '.', '.', '.'],
['.', '.', '8', '.', '.', '7', '.', '6', '.'],
['.', '.', '.', '.', '.', '2', '.', '.', '.'],
['.', '1', '.', '2', '.', '.', '.', '.', '.'],
['.', '2', '.', '.', '3', '.', '.', '.', '.']]
the output should be
sudoku2(grid) = false.

The given grid is not correct because there are two 1s in the second column. Each column, each row, and each 3 × 3 subgrid can only contain the numbers 1 through 9 one time.

https://www.geeksforgeeks.org/check-if-given-sudoku-solution-is-valid-or-not/
 */

fun sudoku2(grid: MutableList<MutableList<Char>>): Boolean {
    for (i in grid.indices) {
        if (!isValidRange(grid[i])) {
            return false
        }
        if (!isValidRange(Helpers.getColumn(grid, i))) {
            return false
        }
    }
    for (i in 0..grid.size - 2 step 3) {
        for (j in 0..grid.size - 2 step 3) {
            val block = mutableListOf<Char>()
            block.addAll(grid[i].subList(j, j+3))
            block.addAll(grid[i+1].subList(j, j+3))
            block.addAll(grid[i+2].subList(j, j+3))
            if (!isValidRange(block)) {
                return false
            }
        }
    }
    return true
}

fun isValidRange(line: MutableList<Char>): Boolean {
    val freq = line.filter { it != '.' }.groupingBy { it }.eachCount()
    return freq.all { it.value == 1 }
}

