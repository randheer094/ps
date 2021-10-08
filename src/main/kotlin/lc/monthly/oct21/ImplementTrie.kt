package lc.monthly.oct21

// https://leetcode.com/problems/implement-trie-prefix-tree/
class ImplementTrie {

    inner class Node(
        val char: Char,
        val childrens: MutableMap<Char, Node> = mutableMapOf()
    ) {
        var isWord: Boolean = false
    }

    private val root = Node(' ')

    fun insert(word: String) {
        insertInternal(word, 0, root)
    }

    fun search(word: String): Boolean {
        return searchInternal(word, 0, root)
    }

    fun startsWith(prefix: String): Boolean {
        return startWithInternal(prefix, 0, root)
    }

    private fun insertInternal(word: String, idx: Int, node: Node) {
        if (idx == word.length) {
            node.isWord = true
            return
        }
        val current = word[idx]
        if (!node.childrens.contains(word[idx])) {
            node.childrens[current] = Node(current)
        }
        insertInternal(word, idx + 1, node.childrens[current]!!)
    }

    private fun searchInternal(word: String, idx: Int, node: Node): Boolean {
        if (idx == word.length) return node.isWord
        val current = word[idx]
        return if (node.childrens.containsKey(current)) {
            searchInternal(word, idx + 1, node.childrens[current]!!)
        } else {
            false
        }
    }

    private fun startWithInternal(word: String, idx: Int, node: Node): Boolean {
        if (idx == word.length) return true
        val current = word[idx]
        return if (node.childrens.containsKey(current)) {
            startWithInternal(word, idx + 1, node.childrens[current]!!)
        } else {
            false
        }
    }
}