package lc.monthly.oct21

import util.TreeNode
import kotlin.math.max

class DiameterOfBinaryTree {
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        val depth = depth(root.left) + depth(root.right)
        val leftDepth = diameterOfBinaryTree(root.left)
        val rightDepth = diameterOfBinaryTree(root.right)
        return max(depth, max(leftDepth, rightDepth))
    }

    private fun depth(root: TreeNode?): Int {
        return if (root == null) {
            0
        } else 1 + max(depth(root.left), depth(root.right))
    }
}