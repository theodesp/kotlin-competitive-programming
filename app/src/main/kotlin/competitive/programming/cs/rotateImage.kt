package competitive.programming.cs
/**
You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).

Example

For

a = [[1, 2, 3],
[4, 5, 6],
[7, 8, 9]]
the output should be

rotateImage(a) =
[[7, 4, 1],
[8, 5, 2],
[9, 6, 3]]

https://www.geeksforgeeks.org/inplace-rotate-square-matrix-by-90-degrees/
A 4 X 4 matrix will have 2 cycles. The first cycle is formed by its 1st row, last column, last row and 1st column.
The second cycle is formed by 2nd row, second-last column, second-last row and 2nd column.
 */

fun rotateImage(a: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    val n = a.size
    for (i in 0 until n) {
        for (j in i until n) {
            val temp = a[i][j]
            a[i][j] = a[j][i]
            a[j][i] = temp
        }
    }
    for (i in 0 until n) {
        for (j in 0 until n / 2) {
            val temp = a[i][j]
            a[i][j] = a[i][n - 1 - j]
            a[i][n - 1 - j] = temp
        }
    }
    return a
}
