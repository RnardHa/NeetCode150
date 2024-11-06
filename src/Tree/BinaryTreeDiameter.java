package Tree;

import Helper.TreeNode;

public class BinaryTreeDiameter {
    public int solution() {
        return diameterOfBinaryTree(input());
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int[] result = new int[1];
        dfs(root, result);
        return result[0];
    }

    private int dfs(TreeNode root, int[] res) {
        if (root == null) {
            return 0;
        }

        int left = dfs(root.left, res);
        int right = dfs(root.right, res);
        res[0] = Math.max(res[0], left + right);
        return 1 + Math.max(left, right);
    }

    private TreeNode input() {
        return new TreeNode(1, null, new TreeNode(2, new TreeNode(3, new TreeNode(5), null), new TreeNode(4)));
    }
}
