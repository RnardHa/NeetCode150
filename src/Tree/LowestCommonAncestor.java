package Tree;

import Helper.TreeNode;

public class LowestCommonAncestor {
    public TreeNode solution() {
        return lowestCommonAncestor(input(), new TreeNode(3), new TreeNode(8));
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node = root;

        while (node != null) {
            if (p.val > node.val && q.val > node.val) {
                node = root.right;
            } else if (p.val < node.val && q.val < node.val) {
                node = root.left;
            } else {
                return node;
            }
        }
        return null;
    }

    private TreeNode input() {
        return new TreeNode(5, new TreeNode(3, new TreeNode(1, null, new TreeNode(2
        )), new TreeNode(4)), new TreeNode(8, new TreeNode(7), new TreeNode(9)));
    }
}
