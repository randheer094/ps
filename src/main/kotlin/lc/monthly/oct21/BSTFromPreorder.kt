package lc.monthly.oct21

import util.TreeNode

// https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
class BSTFromPreorder {
    var nodeIdx = 0
    fun bstFromPreorder(preorder: IntArray): TreeNode? {
        return bstHelper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE)
    }

    private fun bstHelper(preorder: IntArray, start: Int, end: Int): TreeNode? {
        if (nodeIdx == preorder.size || preorder[nodeIdx] < start || preorder[nodeIdx] > end) {
            return null
        }
        val `val` = preorder[nodeIdx++]
        val node = TreeNode(`val`)
        node.left = bstHelper(preorder, start, `val`)
        node.right = bstHelper(preorder, `val`, end)
        return node
    }
}