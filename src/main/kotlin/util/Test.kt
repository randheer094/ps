package util


fun main() {
    println("Test")
}

fun pathSum(root: TreeNode?, sum: Int): Int {
    val preSum = mutableMapOf<Int, Int>()
    preSum[0] = 1
    return helper(root, 0, sum, preSum)
}

fun helper(root: TreeNode?, currSum: Int, target: Int, preSum: MutableMap<Int, Int>): Int {
    var currSum = currSum
    if (root == null) {
        return 0
    }
    currSum += root.`val`
    var res = preSum.getOrDefault(currSum - target, 0)
    preSum[currSum] = preSum.getOrDefault(currSum, 0) + 1
    res += helper(root.left, currSum, target, preSum) + helper(root.right, currSum, target, preSum)
    preSum[currSum] = preSum[currSum]!! - 1
    return res
}