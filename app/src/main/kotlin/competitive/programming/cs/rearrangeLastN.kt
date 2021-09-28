package competitive.programming.cs

/**
Given a singly linked list of integers l and a non-negative integer n, move the last n list nodes to the
beginning of the linked list.

Example

For l = [1, 2, 3, 4, 5] and n = 3, the output should be
rearrangeLastN(l, n) = [3, 4, 5, 1, 2];
For l = [1, 2, 3, 4, 5, 6, 7] and n = 1, the output should be
rearrangeLastN(l, n) = [7, 1, 2, 3, 4, 5, 6].
https://franklingu.github.io/programming/2017/09/15/linked-list-question-rearrange-last-n/
 */
fun rearrangeLastN(l: ListNode<Int>?, n: Int): ListNode<Int>? {
    if (n == 0) {
        return l
    }
    var res = ListNode(0)
    var forward = l // represents the forward node
    var back = l // represents the back node
    for (i in 0 until n) {
        forward = forward?.next
    }
    if (forward == null) {
        return l
    }
    while (forward?.next != null) {
        forward = forward.next
        back = back?.next
    }

    res = back?.next!!
    back.next = null
    forward?.next = l
    return res
}
