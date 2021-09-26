package lc

import helper.BaseTest
import helper.toIntArray
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class TwoSumTest : BaseTest<TwoSum>() {
    override fun init(): TwoSum = TwoSum()

    @Test
    fun test() {
        assertContentEquals("[0,1]".toIntArray(), subject.twoSum("[2,7,11,15]".toIntArray(), 9))
        assertContentEquals("[1,2]".toIntArray(), subject.twoSum("[3,2,4]".toIntArray(), 6))
        assertContentEquals("[0,1]".toIntArray(), subject.twoSum("[3,3]".toIntArray(), 6))
    }
}