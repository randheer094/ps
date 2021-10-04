package lc.monthly.oct21

import helper.BaseTest
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class IslandPerimeterTest : BaseTest<IslandPerimeter>() {
    override fun init() = IslandPerimeter()

    @Test
    fun test() {
        assertEquals(
            16, subject.islandPerimeter(
                arrayOf(
                    intArrayOf(0, 1, 0, 0),
                    intArrayOf(1, 1, 1, 0),
                    intArrayOf(0, 1, 0, 0),
                    intArrayOf(1, 1, 0, 0)
                )
            )
        )
        assertEquals(4, subject.islandPerimeter(arrayOf(intArrayOf(1))))
        assertEquals(4, subject.islandPerimeter(arrayOf(intArrayOf(1, 0))))
    }
}