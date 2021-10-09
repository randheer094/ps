package lc.monthly.oct21

import helper.BaseTest
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class WordSearch2Test : BaseTest<WordSearch2>() {
    override fun init() = WordSearch2()

    @Test
    fun test() {
        var expected = listOf("oath", "eat")
        var actual = subject.findWords(
            arrayOf(
                charArrayOf('o', 'a', 'a', 'n'),
                charArrayOf('e', 't', 'a', 'e'),
                charArrayOf('i', 'h', 'k', 'r'),
                charArrayOf('i', 'f', 'l', 'v')
            ),
            arrayOf("eat", "oath")
        )
        assertContentEquals(expected, actual)

        expected = emptyList()
        actual = subject.findWords(
            arrayOf(
                charArrayOf('a', 'b'),
                charArrayOf('c', 'd')
            ),
            arrayOf("abcd")
        )
        assertContentEquals(expected, actual)
    }
}