import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            // Push all left children to stack
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // Process the current node
            curr = stack.pop();
            result.add(curr.val);

            // Move to the right child
            curr = curr.right;
        }

        return result;
    }
}