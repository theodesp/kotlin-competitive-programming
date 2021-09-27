package competitive.programming.cs

/**
Given a singly linked list of integers, determine whether or not it's a palindrome.

Note: in examples below and tests preview linked lists are presented as arrays just for simplicity of visualization:
in real data you will be given a head node l of the linked list

Example

For l = [0, 1, 0], the output should be
isListPalindrome(l) = true;

For l = [1, 2, 2, 3], the output should be
isListPalindrome(l) = false.

https://www.geeksforgeeks.org/function-to-check-if-a-singly-linked-list-is-palindrome/
 */

fun isListPalindrome(l: ListNode<Int>?): Boolean {
    val (first, second) = splitListHalf(l)
    return compareLists(reverse(first), second)
}

fun findMiddle(l: ListNode<Int>?): ListNode<Int>? {
    var slow = l
    var fast = l

    while (fast?.next != null) {
        fast = fast.next!!.next!!;
        slow = slow?.next;
    }

    return slow
}

fun cloneList(l: ListNode<Int>?): ListNode<Int>? {
    var curr = l
    var temp = ListNode(0)
    val res = temp
    while (curr != null) {
        temp.next = ListNode(curr.value)
        temp = temp.next!!
        curr = curr.next
    }
    return res.next
}

fun splitListHalf(l: ListNode<Int>?): Pair<ListNode<Int>?, ListNode<Int>?> {
    var res_first = ListNode(0)
    var res_second = ListNode(0)
    var curr_first = res_first
    var curr_second = res_second
    var slow = l
    var fast = l

    while (fast?.next != null) {
        fast = fast.next!!.next;
        curr_first.next = ListNode(slow!!.value)
        curr_first = curr_first.next!!
        slow = slow?.next;
    }

    if (fast != null) {
        slow = slow!!.next
    }

    while (slow != null) {
        curr_second.next = ListNode(slow!!.value)
        curr_second = curr_second.next!!
        slow = slow?.next;
    }

    return Pair(res_first.next, res_second.next)
}

fun reverse(l: ListNode<Int>?): ListNode<Int>? {
    val res = ListNode(0)
    var curr = l
    var next: ListNode<Int>? = null
    var prev: ListNode<Int>? = null
    while (curr != null) {
        next = curr.next
        curr.next = prev
        prev = curr
        curr = next
    }
    res.next = prev
    return res.next
}

fun compareLists(l: ListNode<Int>?, r: ListNode<Int>?): Boolean {
    var t1 = l
    var t2 = r

    while (t1 != null && t2 !=  null) {
        if (t1.value != t2.value) {
            return false
        }
        t1 = t1.next
        t2 = t2.next
    }

    return t1 == null && t2 == null
}