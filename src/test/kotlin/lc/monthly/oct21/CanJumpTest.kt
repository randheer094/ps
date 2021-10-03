package lc.monthly.oct21

import helper.BaseTest
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CanJumpTest : BaseTest<CanJump>() {
    override fun init() = CanJump()

    @Test
    fun test() {
        assertTrue { subject.canJump(intArrayOf(2, 3, 1, 1, 4)) }
        assertFalse { subject.canJump(intArrayOf(3, 2, 1, 0, 4)) }
    }
}