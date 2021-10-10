package lc.monthly.oct21

// https://leetcode.com/problems/bitwise-and-of-numbers-range/
class RangeBitwiseAnd {
    fun rangeBitwiseAnd(left: Int, right: Int): Int {
        var left = left
        var right = right
        if (left == 0) {
            return 0
        }
        var moveFactor = 1
        while (left != right) {
            left = left shr 1
            right = right shr 1
            moveFactor = moveFactor shl 1
        }
        return left * moveFactor
    }
}