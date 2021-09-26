package lc

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2) { -1 }
        val numToIdxPair = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val thisNum = nums[i]
            val otherNum = target.minus(thisNum)
            if (numToIdxPair.containsKey(otherNum)) {
                result[0] = numToIdxPair[otherNum]!!
                result[1] = i
                break
            } else {
                numToIdxPair[thisNum] = i
            }
        }
        return result
    }
}