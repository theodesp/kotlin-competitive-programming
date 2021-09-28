package competitive.programming.cs

/**
 *
def mergeTwoLinkedLists(first_list, second_list):
result = ListNode(None)
current = result
# Check each list and append smaller node on each iteration until we exhaust a list
while first_list is not None and second_list is not None:
if first_list.value <= second_list.value:
current.next = first_list
first_list = first_list.next
else:
current.next = second_list
second_list = second_list.next
current = current.next

# Append the remaining list to the result
current.next = first_list if first_list is not None else second_list
return result.next
Given two singly linked lists sorted in non-decreasing order, your task is to merge them. In other words, return a
singly linked list, also sorted in non-decreasing order, that contains the elements from both original lists.

Example

For l1 = [1, 2, 3] and l2 = [4, 5, 6], the output should be
mergeTwoLinkedLists(l1, l2) = [1, 2, 3, 4, 5, 6];
For l1 = [1, 1, 2, 4] and l2 = [0, 3, 5], the output should be
mergeTwoLinkedLists(l1, l2) = [0, 1, 1, 2, 3, 4, 5]
 */

fun mergeTwoLinkedLists(l1: ListNode<Int>?, l2: ListNode<Int>?): ListNode<Int>? {
    var currFirst = l1;var currSecond = l2
    val res = ListNode(0)
    var curr = res
    while (currFirst != null && currSecond != null) {
        if (currFirst.value <= currSecond.value) {
            curr.next = ListNode(currFirst.value)
            currFirst = currFirst.next
        } else {
            curr.next = ListNode(currSecond.value)
            currSecond = currSecond.next
        }
        curr = curr.next!!
    }

    if (currFirst != null) {
        curr.next = currFirst
    }
    if (currSecond != null) {
        curr.next = currSecond
    }

    return res.next
}