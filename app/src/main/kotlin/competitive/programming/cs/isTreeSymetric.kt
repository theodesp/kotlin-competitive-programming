package competitive.programming.cs

/*
Given a binary tree t, determine whether it is symmetric around its center, i.e. each side mirrors the other.

Example

For

t = {
    "value": 1,
    "left": {
        "value": 2,
        "left": {
            "value": 3,
            "left": null,
            "right": null
        },
        "right": {
            "value": 4,
            "left": null,
            "right": null
        }
    },
    "right": {
        "value": 2,
        "left": {
            "value": 4,
            "left": null,
            "right": null
        },
        "right": {
            "value": 3,
            "left": null,
            "right": null
        }
    }
}
the output should be isTreeSymmetric(t) = true.
 */

fun isTreeSymmetric(t: Tree<Int>?): Boolean {
    return isSymmetric(t?.left, t?.right)
}

fun isSymmetric(left: Tree<Int>?, right: Tree<Int>?): Boolean {
    if (left == null && right == null) {
        return true
    }
    if (left != null && right != null && left.value == right.value) {
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left)
    }
    return false
}
