package lc.monthly.oct21

import kotlin.math.abs

// https://leetcode.com/problems/find-all-duplicates-in-an-array/
class FindDuplicates {
    fun findDuplicates(nums: IntArray): List<Int> {
        val result = mutableListOf<Int>()
        for (num in nums) {
            val idx = abs(num) - 1
            if (nums[idx] < 1) {
                result.add(abs(num))
            } else {
                nums[idx] *= -1
            }
        }
        return result
    }
}