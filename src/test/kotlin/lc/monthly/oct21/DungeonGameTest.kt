package lc.monthly.oct21

import helper.BaseTest
import helper.toArrayOf
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DungeonGameTest : BaseTest<DungeonGame>() {
    override fun init() = DungeonGame()

    @Test
    fun test() {
        assertEquals(7, subject.calculateMinimumHP(
            "[[-2,-3,3],[-5,-10,1],[10,30,-5]]".toArrayOf()
        ))
        assertEquals(1, subject.calculateMinimumHP(
            "[[0]]".toArrayOf()
        ))
    }
}