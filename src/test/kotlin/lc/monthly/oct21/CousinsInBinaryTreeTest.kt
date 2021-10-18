package lc.monthly.oct21

import helper.BaseTest
import org.junit.jupiter.api.Test
import util.TreeNode
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CousinsInBinaryTreeTest : BaseTest<CousinsInBinaryTree>() {
    override fun init() = CousinsInBinaryTree()

    @Test
    fun test() {
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        root.left!!.left = TreeNode(4)
        root.right!!.right = TreeNode(5)
        assertFalse { subject.isCousins(root, 3, 4) }
        assertTrue { subject.isCousins(root, 4, 5) }
    }
}