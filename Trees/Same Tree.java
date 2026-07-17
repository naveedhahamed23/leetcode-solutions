/**
 * LeetCode 100 - Same Tree
 *
 * Problem:
 * Determine whether two binary trees are identical.
 * Two trees are considered the same if they have:
 * 1. The same structure.
 * 2. The same node values.
 *
 * Approach:
 * - Use recursion to compare corresponding nodes.
 * - If both nodes are null, they are identical.
 * - If one node is null and the other isn't, the trees differ.
 * - If the node values differ, the trees differ.
 * - Otherwise, recursively compare the left and right subtrees.
 *
 * Time Complexity: O(n)
 * - Each node is visited once.
 *
 * Space Complexity: O(h)
 * - h is the height of the tree due to the recursion stack.
 * - Best Case (Balanced Tree): O(log n)
 * - Worst Case (Skewed Tree): O(n)
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *
 *     TreeNode() {}
 *
 *     TreeNode(int val) {
 *         this.val = val;
 *     }
 *
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Case 1: Both nodes are null -> Trees match at this branch.
        if (p == null && q == null) {
            return true;
        }

        // Case 2: One node is null while the other isn't -> Trees differ.
        if (p == null || q == null) {
            return false;
        }

        // Case 3: Node values are different -> Trees differ.
        if (p.val != q.val) {
            return false;
        }

        // Case 4: Compare left and right subtrees recursively.
        return isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
}
