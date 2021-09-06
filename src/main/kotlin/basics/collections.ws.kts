data class Student(val firstName: String, val grade: Int)

val things = arrayOf(1,2,3, "1", "2", "3") // Array constructor
//things[0] = "5"

val students = arrayOf<Student>(Student("Todd", 10))
val fives = Array(5, ::fiver)

fun fiver(index: Int): Int {
    return index * 5
}

println("${fives.size}")
println("${fives.indices}")

val names = listOf("Theo", "Alex", "Rob", "Chenni") // List constructor
val subNames = names.subList(1,3)

val items = (1..10).toMutableList()
items[0] = 12
items.add(2)
items.remove(5)

val threes = setOf(3,3,3,3)
println(threes)
threes.contains(2)

val fset = mutableSetOf(1,2,3,4,5)
fset.add(6)

val hset = hashSetOf(1,2,3,4,5)

val m1 = mapOf(1 to "alpha", 2 to "beta", 3 to "gamma")
m1.getOrDefault(4, "delta")

val cars = mutableMapOf(
    "ford" to 1903, "gm" to 1908
)

val lst = (1..10).toList()
val tList = lst.map { it * 2 }

val mp = mapOf(1 to 10, 2 to 20, 3 to 30)
val tMap = mp.map { Pair(it.key, it.value * 10) }.toMap()

val fList = lst.filter { it < 5 }