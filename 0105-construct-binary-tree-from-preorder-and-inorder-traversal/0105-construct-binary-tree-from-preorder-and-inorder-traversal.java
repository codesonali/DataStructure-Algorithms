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

    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0, inorder.length - 1);
    }

    public TreeNode helper(int[] preorder, int[] inorder, int left, int right) {

        if (left > right) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preIndex++]);

        int inIndex = search(inorder, left, right, root.val);

        root.left = helper(preorder, inorder, left, inIndex - 1);
        root.right = helper(preorder, inorder, inIndex + 1, right);

        return root;
    }

    public int search(int[] inorder, int left, int right, int val) {

        for (int i = left; i <= right; i++) {
            if (inorder[i] == val) {
                return i;
            }
        }

        return -1;
    }
}