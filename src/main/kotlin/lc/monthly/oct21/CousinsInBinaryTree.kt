package lc.monthly.oct21

import util.TreeNode
import java.util.*

// https://leetcode.com/problems/cousins-in-binary-tree/
class CousinsInBinaryTree {
    fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {
        if (root == null) return false
        val queue: Queue<TreeNode> = LinkedList()
        queue.offer(root)
        while (!queue.isEmpty()) {
            val size = queue.size
            var xExist = false
            var yExist = false
            for (i in 0 until size) {
                val cur = queue.poll()
                if (cur.`val` == x) xExist = true
                if (cur.`val` == y) yExist = true
                if (cur.left != null && cur!!.right != null) {
                    if (cur.left!!.`val` == x && cur.right!!.`val` == y) {
                        return false
                    }
                    if (cur.left!!.`val` == y && cur.right!!.`val` == x) {
                        return false
                    }
                }
                if (cur.left != null) {
                    queue.offer(cur.left)
                }
                if (cur.right != null) {
                    queue.offer(cur.right)
                }
            }
            if (xExist && yExist) return true
        }
        return false
    }
}