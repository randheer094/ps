package lc.monthly.oct21

// https://leetcode.com/problems/jump-game/
class CanJump {
    fun canJump(nums: IntArray): Boolean {
        var reachable = 0
        for (i in nums.indices) {
            if (i > reachable) return false
            reachable = maxOf(reachable, i + nums[i])
        }
        return true
    }
}