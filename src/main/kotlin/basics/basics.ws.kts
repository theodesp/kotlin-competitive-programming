val count: Int = 0 // Immutable value
println(count);

val other = 43 // Type inference
val longNum = 55L // Long number
//val myByte: Byte = 222 // Bytes
val myShort: Short = 32767 // Short
val myFloat = 227.1F // Float
val myDouble = 227.1 // Double

val asInt = myDouble.toInt() // double to int
val asFloat = longNum.toFloat() // long to float

val maxInt: Int = 2_147_483_647

val myHex = 0xFEC // Hex
val myBin = 0b10101 // Binary
//val myOctal = 0766 // Octal

val myBool = true // Boolean
val myChar = 'a' // Char
val myUnicode = '\u221E' // Unicode
println(myUnicode)

// Operators
1 > 2 && 2 < 1 // False
//1 > 2 or 2 < 1 // False

// Strings
val greeting = "Hello"
val owe = 50

val janet = "I owe Jane \$$owe dollars"
println(janet)
println("[${greeting}] is ${greeting.length} characters long")

// Control flow
val smaller = 1
val bigger = 2
val max = if (bigger > smaller) bigger else smaller

val age = 35
val group = when (age) {
    in 0..18 -> "family"
    in 65..120 -> "senior"
    else -> "regular"
}
println(group)

// Loops
for (i in 1..10) {
    println(i)
}

val students = listOf("janet", "daisy", "Vicky")
for (student in students) {
    println(student)
}

for ((index, student) in students.withIndex()) {
    println(student)
}

