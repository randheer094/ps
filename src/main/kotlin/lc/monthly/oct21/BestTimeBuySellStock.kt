package lc.monthly.oct21

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class BestTimeBuySellStock {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = Int.MAX_VALUE
        var maxProfit = 0
        for (i in prices.indices) {
            val dayPrice = prices[i]
            if (dayPrice < minPrice) {
                minPrice = dayPrice
            } else if (dayPrice - minPrice > maxProfit) {
                maxProfit = dayPrice - minPrice
            }
        }
        return maxProfit
    }
}