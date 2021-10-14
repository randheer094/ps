package lc.monthly.oct21

import java.util.*
import kotlin.math.min

// https://leetcode.com/problems/perfect-squares/
class PerfectSquare {
    fun numSquares(n: Int): Int {
        val dp = IntArray(n + 1)
        Arrays.fill(dp, Int.MAX_VALUE)
        dp[0] = 0
        for (i in 1..n) {
            var min = Int.MAX_VALUE
            var j = 1
            while (i - j * j >= 0) {
                min = min(min, dp[i - j * j] + 1)
                ++j
            }
            dp[i] = min
        }
        return dp[n]
    }
}