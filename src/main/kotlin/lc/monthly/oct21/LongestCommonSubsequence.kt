package lc.monthly.oct21

// https://leetcode.com/problems/longest-common-subsequence/
class LongestCommonSubsequence {
    fun longestCommonSubsequence(text1: String, text2: String): Int {
        val dp = Array(text1.length + 1) { IntArray(text2.length + 1) { 0 } }
        for (i in 1..text1.length) {
            for (j in 1..text2.length) {
                if (text1[i - 1] == text2[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1]
                } else {
                    dp[i][j] = maxOf(dp[i][j - 1], dp[i - 1][j])
                }
            }
        }
        return dp[text1.length][text2.length]
    }
}