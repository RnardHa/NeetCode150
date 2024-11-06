package Tree;

import Helper.TreeNode;

public class BalancedBinaryTree {
    public boolean solution() {
        return isBalanced(input());
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        if (Math.abs(left - right) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(dfs(root.left),dfs(root.right));
    }

    private TreeNode input() {
        return new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), null));
    }
}
