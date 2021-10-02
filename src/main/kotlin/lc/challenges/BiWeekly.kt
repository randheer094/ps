package lc.challenges

class BiWeekly62 {
    // https://leetcode.com/contest/biweekly-contest-62/ranking/
    fun construct2DArray(original: IntArray, m: Int, n: Int): Array<IntArray> {
        if (m.times(n) != original.size) return emptyArray()
        val res = Array(m) { IntArray(n) }
        var idx = 0
        for (i in 0 until m) {
            for (j in 0 until n) {
                res[i][j] = original[idx++]
            }
        }
        return res
    }

    // https://leetcode.com/contest/biweekly-contest-62/problems/number-of-pairs-of-strings-with-concatenation-equal-to-target/
    fun numOfPairs(nums: Array<String>, target: String): Int {
        var count = 0
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if ("${nums[i]}${nums[j]}" == target) count++
                if ("${nums[j]}${nums[i]}" == target) count++
            }
        }
        return count
    }
}
