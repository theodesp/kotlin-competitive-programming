package competitive.programming.cs

import java.util.*

/**
You are given a list dishes, where each element consists of a list of strings beginning with the name of the dish,
followed by all the ingredients used in preparing it. You want to group the dishes by ingredients, so that for
each ingredient you'll be able to find all the dishes that contain it (if there are at least 2 such dishes).

Return an array where each element is a list beginning with the ingredient name, followed by the names of all
the dishes that contain this ingredient. The dishes inside each list should be sorted lexicographically,
and the result array should be sorted lexicographically by the names of the ingredients.

Example

For
dishes = [["Salad", "Tomato", "Cucumber", "Salad", "Sauce"],
["Pizza", "Tomato", "Sausage", "Sauce", "Dough"],
["Quesadilla", "Chicken", "Cheese", "Sauce"],
["Sandwich", "Salad", "Bread", "Tomato", "Cheese"]]
the output should be
groupingDishes(dishes) = [["Cheese", "Quesadilla", "Sandwich"],
["Salad", "Salad", "Sandwich"],
["Sauce", "Pizza", "Quesadilla", "Salad"],
["Tomato", "Pizza", "Salad", "Sandwich"]]
For
dishes = [["Pasta", "Tomato Sauce", "Onions", "Garlic"],
["Chicken Curry", "Chicken", "Curry Sauce"],
["Fried Rice", "Rice", "Onions", "Nuts"],
["Salad", "Spinach", "Nuts"],
["Sandwich", "Cheese", "Bread"],
["Quesadilla", "Chicken", "Cheese"]]
the output should be
groupingDishes(dishes) = [["Cheese", "Quesadilla", "Sandwich"],
["Chicken", "Chicken Curry", "Quesadilla"],
["Nuts", "Fried Rice", "Salad"],
["Onions", "Fried Rice", "Pasta"]]
 */

fun groupingDishes(dishes: MutableList<MutableList<String>>): MutableList<MutableList<String>> {
    val freqTable = sortedMapOf<String, SortedSet<String>>()
    for (dish in dishes) {
        val name = dish.first()
        val ingredients = dish.slice(1 until dish.size)
        for (ingredient in ingredients) {
            if (freqTable.containsKey(ingredient)) {
                freqTable[ingredient]?.add(name)
            } else {
                freqTable[ingredient] = sortedSetOf(name)
            }
        }
    }
    val res: MutableList<MutableList<String>> = mutableListOf()
    for (key in freqTable.keys) {
        val items = freqTable[key]
        if ((items?.size ?: 0) > 1) {
            val line = mutableListOf(key)
            line.addAll(items?.toMutableList() ?: mutableListOf())
            res.add(line)
        }
    }
    return res
}

