package lc.monthly.oct21

// https://leetcode.com/problems/guess-number-higher-or-lower/
abstract class GuessGame {
    var pick: Int = 0

    fun guess(guess: Int): Int {
        return when {
            pick < guess -> -1
            pick > guess -> 1
            else -> 0
        }
    }

    abstract fun guessNumber(n: Int): Int
}

class GuessGameImpl : GuessGame() {
    override fun guessNumber(n: Int): Int {
        var start = 1
        var end = n
        while (end > start) {
            val mid = start + (end - start) / 2
            val guessR = guess(mid)
            if (guessR == 0) return mid
            if (guessR == -1) {
                end = mid - 1
            } else {
                start = mid + 1
            }
        }
        return start
    }

}