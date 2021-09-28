package competitive.programming.cs

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class groupingDishesTest: StringSpec({
    "1st" {
        groupingDishes(mutableListOf(
            mutableListOf("Salad", "Tomato", "Cucumber", "Salad", "Sauce"),
            mutableListOf("Pizza", "Tomato", "Sausage", "Sauce", "Dough"),
            mutableListOf("Quesadilla", "Chicken", "Cheese", "Sauce"),
            mutableListOf("Sandwich", "Salad", "Bread", "Tomato", "Cheese"),
        )) shouldBe mutableListOf(
            mutableListOf("Cheese", "Quesadilla", "Sandwich"),
            mutableListOf("Salad", "Salad", "Sandwich"),
            mutableListOf("Sauce", "Pizza", "Quesadilla", "Salad"),
            mutableListOf("Tomato", "Pizza", "Salad", "Sandwich"),
        )
    }
})
