package lc.monthly.oct21

import helper.BaseTest
import org.junit.jupiter.api.Test
import util.TreeNode
import kotlin.test.assertEquals

class DiameterOfBinaryTreeTest : BaseTest<DiameterOfBinaryTree>() {
    override fun init() = DiameterOfBinaryTree()

    @Test
    fun test() {
        var root = TreeNode(1).also {
            it.right = TreeNode(3)
            it.left = TreeNode(2).also { it2 ->
                it2.left = TreeNode(4)
                it2.right = TreeNode(5)
            }
        }
        assertEquals(3, subject.diameterOfBinaryTree(root))
        root = TreeNode(1).also {
            it.right = TreeNode(2)
        }
        assertEquals(1, subject.diameterOfBinaryTree(root))
    }

}