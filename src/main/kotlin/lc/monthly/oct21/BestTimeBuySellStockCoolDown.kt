package lc.monthly.oct21

import kotlin.math.max
import kotlin.math.min

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
class BestTimeBuySellStockCoolDown {
    fun maxProfit(prices: IntArray): Int {
        if (prices.size < 2) return 0
        val sell = IntArray(prices.size)
        val buy = IntArray(prices.size)

        buy[0] = -prices[0]
        buy[1] = -min(prices[0], prices[1])
        sell[1] = max(0, buy[0] + prices[1])

        for (i in 2 until prices.size) {
            buy[i] = max(buy[i - 1], sell[i - 2] - prices[i])
            sell[i] = max(sell[i - 1], buy[i - 1] + prices[i])
        }
        return sell[prices.size - 1]
    }
}