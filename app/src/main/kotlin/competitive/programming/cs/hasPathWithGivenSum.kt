package competitive.programming.cs

/*
Given a binary tree t and an integer s, determine whether there is a root to leaf path in t such that the sum
of vertex values equals s.

Example

For

t = {
    "value": 4,
    "left": {
        "value": 1,
        "left": {
            "value": -2,
            "left": null,
            "right": {
                "value": 3,
                "left": null,
                "right": null
            }
        },
        "right": null
    },
    "right": {
        "value": 3,
        "left": {
            "value": 1,
            "left": null,
            "right": null
        },
        "right": {
            "value": 2,
            "left": {
                "value": -2,
                "left": null,
                "right": null
            },
            "right": {
                "value": -3,
                "left": null,
                "right": null
            }
        }
    }
}
and
s = 7,
the output should be hasPathWithGivenSum(t, s) = true.

This is what this tree looks like:

      4
     / \
    1   3
   /   / \
  -2  1   2
    \    / \
     3  -2 -3
Path 4 -> 3 -> 2 -> -2 gives us 7, the required sum.
https://www.geeksforgeeks.org/root-to-leaf-path-sum-equal-to-a-given-number/
 */

data class Tree<T>(var value: T) {
    var left: Tree<T>? = null;
    var right: Tree<T>? = null;
}

fun hasPathWithGivenSum(t: Tree<Int>?, s: Int): Boolean {
    var res = false
    val subSum = s - (t?.value ?: 0);

    if (subSum == 0 && isLeaf(t)) {
        res = true
    } else {
        if (t?.left != null) {
            res = res || hasPathWithGivenSum(t.left, subSum)
        }
        if (t?.right != null) {
            res =  res || hasPathWithGivenSum(t.right, subSum)
        }
    }
    return res
}

fun isLeaf(t: Tree<Int>?): Boolean {
    return t?.left == null && t?.right == null
}