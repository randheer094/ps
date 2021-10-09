package lc.monthly.oct21

// https://leetcode.com/problems/word-search-ii/
class WordSearch2 {
    class Trie constructor(private val root: Node = Node()) {

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

        companion object {
            fun build(words: Array<String>) = Trie().apply {
                words.forEach { insert(it) }
            }
        }
    }

    fun findWords(board: Array<CharArray>, words: Array<String>): List<String> {
        if (words.isEmpty() || board.isEmpty()) return emptyList()
        val result = mutableListOf<String>()

        val trie = Trie.build(words)

        fun recursiveFindWords(board: Array<CharArray>, parent: Trie.Node, x: Int, y: Int) {
            if (outOfBounds(board, x, y) || board[x][y] == '#' || parent.children[board[x][y]] == null) {
                return
            }
            val char = board[x][y]
            val child: Trie.Node = parent.children[char]!!
            if (child.isWord) {
                result.add(child.word.orEmpty())
                child.unMarkWord()
            }
            board[x][y] = '#'
            recursiveFindWords(board, child, x, y - 1)
            recursiveFindWords(board, child, x - 1, y)
            recursiveFindWords(board, child, x, y + 1)
            recursiveFindWords(board, child, x + 1, y)
            board[x][y] = char
        }

        for (i in board.indices) {
            for (j in board[0].indices) {
                recursiveFindWords(board, trie.getRoot(), i, j)
            }
        }

        return result
    }

    private fun outOfBounds(board: Array<CharArray>, x: Int, y: Int): Boolean {
        return x < 0 || x >= board.size || y < 0 || y >= board[0].size
    }
}