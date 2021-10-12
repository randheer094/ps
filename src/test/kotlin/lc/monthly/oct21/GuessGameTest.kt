package lc.monthly.oct21

import helper.BaseTest
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class GuessGameTest : BaseTest<GuessGame>() {
    override fun init() = GuessGameImpl()

    @Test
    fun test() {
        subject.pick = 6
        assertEquals(subject.pick, subject.guessNumber(10))
        subject.pick = 1
        assertEquals(subject.pick, subject.guessNumber(1))
        subject.pick = 1
        assertEquals(subject.pick, subject.guessNumber(2))
        subject.pick = 2
        assertEquals(subject.pick, subject.guessNumber(2))

    }
}