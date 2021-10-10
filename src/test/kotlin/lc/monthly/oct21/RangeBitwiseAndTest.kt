package lc.monthly.oct21

import helper.BaseTest
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RangeBitwiseAndTest : BaseTest<RangeBitwiseAnd>() {
    override fun init() = RangeBitwiseAnd()

    @Test
    fun test() {
        assertEquals(4, subject.rangeBitwiseAnd(5, 7))
        assertEquals(0, subject.rangeBitwiseAnd(0, 0))
        assertEquals(0, subject.rangeBitwiseAnd(1, 2147483647))
    }
}