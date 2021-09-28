package competitive.programming.cs

/**
Given an array of integers nums and an integer k, determine whether there are two
distinct indices i and j in the array where nums[i] = nums[j] and the absolute difference
between i and j is less than or equal to k.

Example

For nums = [0, 1, 2, 3, 5, 2] and k = 3, the output should be
containsCloseNums(nums, k) = true.

There are two 2s in nums, and the absolute difference between their positions is exactly 3.

For nums = [0, 1, 2, 3, 5, 2] and k = 2, the output should be
containsCloseNums(nums, k) = false.

The absolute difference between the positions of the two 2s is 3, which is more than k.

from collections import defaultdict
def containsCloseNums(nums, k):
result = False
index_table = {}
for index, i in enumerate(nums):
if i not in index_table.keys():
index_table[i] = index
else:
if index - index_table[i] <= k:
result = True
index_table[i] = index

return result
 */

fun containsCloseNums(nums: MutableList<Int>, k: Int): Boolean {
    val index = hashMapOf<Int, Int>()
    for (i in nums.indices) {
        if (!index.containsKey(nums[i])) {
            index[nums[i]] = i
        } else {
            if (i - index[nums[i]]!! <= k) {
                return true
            }
            index[nums[i]] = i
        }
    }
    return false
}
