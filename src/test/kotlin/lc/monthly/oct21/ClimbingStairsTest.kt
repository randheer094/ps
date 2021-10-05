package lc.monthly.oct21

import helper.BaseTest
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ClimbingStairsTest : BaseTest<ClimbingStairs>() {
    override fun init() = ClimbingStairs()

    @Test
    fun test() {
        assertEquals(2, subject.climbStairs(2))
        assertEquals(3, subject.climbStairs(3))
    }
}