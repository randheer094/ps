package lc.monthly.oct21

import helper.BaseTest
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BestTimeBuySellStock3Test : BaseTest<BestTimeBuySellStock3>() {
    override fun init() = BestTimeBuySellStock3()

    @Test
    fun test() {
        assertEquals(6, subject.maxProfit(intArrayOf(3, 3, 5, 0, 0, 3, 1, 4)))
        assertEquals(4, subject.maxProfit(intArrayOf(1, 2, 3, 4, 5)))
        assertEquals(0, subject.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
        assertEquals(0, subject.maxProfit(intArrayOf(1)))
    }
}