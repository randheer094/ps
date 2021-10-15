package lc.monthly.oct21

import helper.BaseTest
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BestTimeBuySellStockCoolDownTest : BaseTest<BestTimeBuySellStockCoolDown>() {
    override fun init() = BestTimeBuySellStockCoolDown()

    @Test
    fun test() {
        assertEquals(3, subject.maxProfit(intArrayOf(1, 2, 3, 0, 2)))
        assertEquals(0, subject.maxProfit(intArrayOf(1)))
    }
}