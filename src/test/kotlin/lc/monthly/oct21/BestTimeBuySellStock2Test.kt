package lc.monthly.oct21

import helper.BaseTest
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BestTimeBuySellStock2Test : BaseTest<BestTimeBuySellStock2>() {
    override fun init() = BestTimeBuySellStock2()

    @Test
    fun test() {
        assertEquals(7, subject.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
        assertEquals(4, subject.maxProfit(intArrayOf(1, 2, 3, 4, 5)))
        assertEquals(0, subject.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
    }
}