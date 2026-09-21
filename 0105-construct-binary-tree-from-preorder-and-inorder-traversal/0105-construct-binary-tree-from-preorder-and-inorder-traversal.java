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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, 0, preorder.length - 1,
                     inorder, 0, inorder.length - 1);
    }

    private TreeNode build(
            int[] preorder, int preStart, int preEnd,
            int[] inorder, int inStart, int inEnd) {

        // No elements
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        // First element of preorder = root
        TreeNode root = new TreeNode(preorder[preStart]);

        // Find root in inorder
        int index = inStart;

        while (inorder[index] != root.val) {
            index++;
        }

        // Number of nodes in left subtree
        int leftSize = index - inStart;

        // Build left subtree
        root.left = build(
                preorder,
                preStart + 1,
                preStart + leftSize,
                inorder,
                inStart,
                index - 1
        );

        // Build right subtree
        root.right = build(
                preorder,
                preStart + leftSize + 1,
                preEnd,
                inorder,
                index + 1,
                inEnd
        );

        return root;
    }
}