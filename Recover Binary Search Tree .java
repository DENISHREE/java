
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void recoverTree(TreeNode root) {
        TreeNode[] swapped = new TreeNode[2]; 
        TreeNode[] prev = new TreeNode[1]; 
        inorder(root, prev, swapped);
        if (swapped[0] != null && swapped[1] != null) {
            int temp = swapped[0].val;
            swapped[0].val = swapped[1].val;
            swapped[1].val = temp;
        }
    }

    private void inorder(TreeNode node, TreeNode[] prev, TreeNode[] swapped) {
        if (node == null) {
            return;
        }
        inorder(node.left, prev, swapped);
        if (prev[0] != null && node.val < prev[0].val) {
            if (swapped[0] == null) {
                swapped[0] = prev[0];
            }
            swapped[1] = node;
        }
        prev[0] = node;
        inorder(node.right, prev, swapped);
    }
}
