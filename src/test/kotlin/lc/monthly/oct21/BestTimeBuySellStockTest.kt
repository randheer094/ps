package lc.monthly.oct21

import helper.BaseTest
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BestTimeBuySellStockTest : BaseTest<BestTimeBuySellStock>() {
    override fun init() = BestTimeBuySellStock()

    @Test
    fun test() {
        assertEquals(5, subject.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
        assertEquals(0, subject.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
    }
}