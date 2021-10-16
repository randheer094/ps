package lc.monthly.oct21

import kotlin.math.max

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
class BestTimeBuySellStock3 {
    fun maxProfit(prices: IntArray): Int {
        if (prices.isEmpty()) return 0
        var s1 = -prices[0]
        var s2: Int = Int.MIN_VALUE
        var s3: Int = Int.MIN_VALUE
        var s4: Int = Int.MIN_VALUE

        for (i in 1 until prices.size) {
            s1 = max(s1, -prices[i])
            s2 = max(s2, s1 + prices[i])
            s3 = max(s3, s2 - prices[i])
            s4 = max(s4, s3 + prices[i])
        }

        return max(0, s4)
    }
}