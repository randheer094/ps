package lc.monthly.oct21

// https://leetcode.com/problems/word-search/
class WordSearch {
    fun exist(board: Array<CharArray>, word: String): Boolean {

        val m = board.lastIndex
        val n = board[0].lastIndex

        fun search(i: Int, j: Int, idx: Int): Boolean {
            if (word[idx] != board[i][j]) return false
            if (idx == word.lastIndex) return true

            val nextIdx = idx.plus(1)

            board[i][j]  = (board[i][j].code).xor(256).toChar()

            val nextX = i < m && search(i + 1, j, nextIdx)
            val prevX = i > 0 && search(i - 1, j, nextIdx)

            val nextY = j < n && search(i, j + 1, nextIdx)
            val prevY = j > 0 && search(i, j - 1, nextIdx)

            board[i][j]  = (board[i][j].code).xor(256).toChar()

            return nextX || nextY || prevX || prevY
        }

        for (i in board.indices) {
            for (j in board[0].indices) {
                val result = search(i, j, 0)
                if (result) return true
            }
        }

        return false
    }


}