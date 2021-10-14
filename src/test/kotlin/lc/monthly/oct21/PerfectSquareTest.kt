package lc.monthly.oct21

import helper.BaseTest
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PerfectSquareTest : BaseTest<PerfectSquare>() {
    override fun init() = PerfectSquare()

    @Test
    fun test() {
        assertEquals(3, subject.numSquares(12))
        assertEquals(2, subject.numSquares(13))
    }
}