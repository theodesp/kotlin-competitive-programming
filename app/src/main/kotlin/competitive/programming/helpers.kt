package competitive.programming

object Helpers {
    fun readLn() = readLine()!! // string line
    fun readInt() = readLn().toInt() // single int
    fun readStrings() = readLn().split(" ") // list of strings
    fun readInts() = readStrings().map { it.toInt() } // list of ints
    fun charFreq(s: String) = s.groupingBy { it }.eachCount()
    fun getColumn(grid: MutableList<MutableList<Char>>, col: Int) = MutableList(grid.size) { grid[it][col] }
}