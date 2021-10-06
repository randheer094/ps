package lc.monthly.oct21

import helper.BaseTest
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class FindDuplicatesTest : BaseTest<FindDuplicates>() {
    override fun init() = FindDuplicates()

    @Test
    fun test() {
        assertContentEquals(listOf(2,3), subject.findDuplicates(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)))
        assertContentEquals(listOf(1), subject.findDuplicates(intArrayOf(1, 1, 2)))
        assertContentEquals(listOf(), subject.findDuplicates(intArrayOf(1)))
    }
}