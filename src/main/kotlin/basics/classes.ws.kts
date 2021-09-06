class ShortClass
class PlainClass {}
class WithConstructor constructor(name: String, age: Int) {}
class WithoutConstructor(name: String, age: Int) {}
class MandatoryConstructor internal constructor (name: String, age: Int) {}

class Vehicle(
    val make: String, val model: String
) {
    override fun toString(): String {
        return "$make $model"
    }

    init {
        println("First Init")
    }
}

Vehicle("Fiesta", "Ford")

class CantCreate private constructor(val message: String) {
    companion object {
        fun factory(msg: String): CantCreate {
            return CantCreate(msg)
        }
    }
}

CantCreate.factory("Hello")