package lc.monthly.oct21

import helper.BaseTest
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LongestCommonSubsequenceTest : BaseTest<LongestCommonSubsequence>() {
    override fun init() = LongestCommonSubsequence()

    @Test
    fun test() {
        assertEquals(3, subject.longestCommonSubsequence("abcde", "ace"))
        assertEquals(0, subject.longestCommonSubsequence("abc", "def"))
    }
}