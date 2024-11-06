package Tree;

import Helper.TreeNode;

public class DepthOfBinaryTree {
    public int solution() {
        return maxDepth(input());
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    private TreeNode input() {
        return new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), null));
    }
}
