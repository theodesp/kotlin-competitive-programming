val adder: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
adder(2, 5)

val muler = { a: Int, b: Int -> a * b }
muler(2, 5)
muler.invoke(2, 3)

val greet: String.() -> String = { "What's up $this?"}
"Alex".greet()

val nums = (1..10).toList()
val filtered = nums.filter(fun(a : Int): Boolean { return a < 5 })

val getAge = lambda@{ age: Int ->
    if (age >= 65)
        return@lambda "senior consultant"
    else
        return@lambda "junior consultant"
}