package lc.monthly.oct21

// https://leetcode.com/problems/climbing-stairs/
class ClimbingStairs {
    fun climbStairs(n: Int): Int {
        if (n <= 2) {
            return n
        }
        val mem = IntArray(n)
        mem[0] = 1
        mem[1] = 2
        for (i in 2 until n) {
            mem[i] = mem[i - 1] + mem[i - 2]
        }
        return mem[n - 1]
    }
}