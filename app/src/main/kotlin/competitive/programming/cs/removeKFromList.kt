package competitive.programming.cs

data class ListNode<T>(var value: T, var next: ListNode<T>? = null) {
}
fun makeListNode(list: Array<Int>): ListNode<Int> {
    val res = ListNode(0)
    var prev = res
    for (i in list) {
        prev.next = ListNode(i)
        prev = prev.next!!
    }

    return res.next!!
}
fun removeKFromList(l: ListNode<Int>?, k: Int): ListNode<Int>? {
    if (k == 0) {
        return l
    }
    val res = ListNode(0)
    res.next = l
    var curr = res
    while (curr != null) {
        while (curr?.next != null && curr.next!!.value == k) {
            curr.next = curr.next!!.next
        }
        if (curr.next != null) {
            curr = curr.next!!
        } else {
            break
        }
    }
    if (res.next == null) {
        return null
    }
    return res.next!!
}
