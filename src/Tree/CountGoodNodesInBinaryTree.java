package Tree;

import Helper.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CountGoodNodesInBinaryTree {
    public int solution() {
        return goodNodes(input());
    }

    public int goodNodes(TreeNode root) {
        //BSF
        int count = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode node = queue.poll();

            for (int i = 0; i < size; i++) {
                if (node != null) {
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            }
        }

        return count;
    }

    private TreeNode input() {
        return new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(-1));
    }
}
