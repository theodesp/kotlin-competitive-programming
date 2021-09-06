data class Person(var firstName: String, var lastName: String)


//val p: Person = null
val p: Person? = null

val greetings: String? = "Hello"
if (greetings != null) {

}

println("greetings length ${greetings?.length}")
val gLen = greetings?.length ?: 2
val badLen = greetings!!.length

