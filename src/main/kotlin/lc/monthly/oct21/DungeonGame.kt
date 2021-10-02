package lc.monthly.oct21

import kotlin.math.max
import kotlin.math.min

// https://leetcode.com/problems/dungeon-game/
class DungeonGame {
    fun calculateMinimumHP(dungeon: Array<IntArray>): Int {
        if (dungeon.isEmpty()) return -1
        val m = dungeon.size
        val n = dungeon[0].size
        val dp = Array(m) { IntArray(n) }
        for (i in m - 1 downTo 0) {
            for (j in n - 1 downTo 0) {
                if (i == m - 1 && j == n - 1) {
                    dp[i][j] = max(1, 1 - dungeon[i][j])
                } else if (i == m - 1) {
                    dp[i][j] = max(dp[i][j + 1] - dungeon[i][j], 1)
                } else if (j == n - 1) {
                    dp[i][j] = max(dp[i + 1][j] - dungeon[i][j], 1)
                } else {
                    dp[i][j] = max(min(dp[i + 1][j], dp[i][j + 1]) - dungeon[i][j], 1)
                }
            }
        }
        return dp[0][0]
    }
}