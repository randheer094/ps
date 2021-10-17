package lc.challenges

class Weekly263 {
    // https://leetcode.com/contest/weekly-contest-263/problems/check-if-numbers-are-ascending-in-a-sentence/
    fun areNumbersAscending(s: String): Boolean {
        val nums = s.split(" ").mapNotNull { it.toIntOrNull() }
        for (i in 1 until nums.size) {
            if (nums[i - 1] >= nums[i]) return false
        }
        return true
    }

    // https://leetcode.com/contest/weekly-contest-263/problems/simple-bank-system/
    class Bank(private val balance: LongArray) {

        fun transfer(account1: Int, account2: Int, money: Long): Boolean {
            if (!validAccount(account1) || !validAccount(account2) || balance[account1 - 1] < money) return false
            balance[account1 - 1] -= money
            balance[account2 - 1] += money
            return true
        }

        fun deposit(account: Int, money: Long): Boolean {
            if (!validAccount(account)) return false
            balance[account - 1] += money
            return true
        }

        fun withdraw(account: Int, money: Long): Boolean {
            if (!validAccount(account) || balance[account - 1] < money) return false
            balance[account - 1] -= money
            return true
        }

        private fun validAccount(account: Int) = account in 1..balance.size
    }

}