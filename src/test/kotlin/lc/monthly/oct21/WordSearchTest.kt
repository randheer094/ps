package lc.monthly.oct21

import helper.BaseTest
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class WordSearchTest : BaseTest<WordSearch>() {
    override fun init() = WordSearch()

    @Test
    fun test() {
        assertTrue {
            subject.exist(
                arrayOf(
                    charArrayOf('A', 'B', 'C', 'E'),
                    charArrayOf('S', 'F', 'C', 'S'),
                    charArrayOf('A', 'D', 'E', 'E')
                ),
                "ABCCED"
            )
        }
        assertTrue {
            subject.exist(
                arrayOf(
                    charArrayOf('A', 'B', 'C', 'E'),
                    charArrayOf('S', 'F', 'C', 'S'),
                    charArrayOf('A', 'D', 'E', 'E')
                ),
                "SEE"
            )
        }
        assertFalse {
            subject.exist(
                arrayOf(
                    charArrayOf('A', 'B', 'C', 'E'),
                    charArrayOf('S', 'F', 'C', 'S'),
                    charArrayOf('A', 'D', 'E', 'E')
                ),
                "ABCB"
            )
        }
    }
}