package lc.monthly.oct21

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
class BestTimeBuySellStock2 {
    fun maxProfit(prices: IntArray): Int {
        var maxprofit = 0
        for (i in 1 until prices.size) {
            if (prices[i] > prices[i - 1]) maxprofit += prices[i] - prices[i - 1]
        }
        return maxprofit
    }
}