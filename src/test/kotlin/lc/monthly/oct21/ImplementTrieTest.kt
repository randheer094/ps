package lc.monthly.oct21

import helper.BaseTest
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ImplementTrieTest : BaseTest<ImplementTrie>() {
    override fun init() = ImplementTrie()

    @Test
    fun test() {
        subject.insert("apple")
        assertTrue { subject.search("apple") }
        assertFalse { subject.search("app") }
        assertTrue { subject.startsWith("app") }
        subject.insert("app")
        assertTrue { subject.search("app") }
    }
}