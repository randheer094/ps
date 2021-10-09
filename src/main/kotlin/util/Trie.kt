package util

// Trie DS building block
internal class Trie constructor(private val root: Node = Node()) {

    class Node(val children: MutableMap<Char, Node> = mutableMapOf()) {
        var isWord: Boolean = false
            private set
        var word: String? = null
            private set

        fun markWord(word: String? = null) {
            isWord = true
            this.word = word
        }

        fun unMarkWord() {
            isWord = false
            this.word = null
        }
    }

    fun getRoot() = root

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
            node.markWord(word)
            return
        }
        val current = word[idx]
        if (!node.children.contains(word[idx])) {
            node.children[current] = Node()
        }
        insertInternal(word, idx + 1, node.children[current]!!)
    }

    private fun searchInternal(word: String, idx: Int, node: Node): Boolean {
        if (idx == word.length) return node.isWord
        val current = word[idx]
        return if (node.children.containsKey(current)) {
            searchInternal(word, idx + 1, node.children[current]!!)
        } else {
            false
        }
    }

    private fun startWithInternal(word: String, idx: Int, node: Node): Boolean {
        if (idx == word.length) return true
        val current = word[idx]
        return if (node.children.containsKey(current)) {
            startWithInternal(word, idx + 1, node.children[current]!!)
        } else {
            false
        }
    }

    companion object {
        fun build(words: Array<String>) = Trie().apply {
            words.forEach { insert(it) }
        }
    }
}