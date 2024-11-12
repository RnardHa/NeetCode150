package Tree;

import Helper.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public List<Integer> solution() {
        return rightSideView(input());
    }

    public List<Integer> rightSideView(TreeNode root) {
        //BSF
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            var size = queue.size();
            TreeNode rightSide = null;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    rightSide = node;
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            if (rightSide != null) {
                res.add(rightSide.val);
            }
        }
        return res;
    }

    private TreeNode input() {
        return new TreeNode(1, new TreeNode(2), new TreeNode(3));
    }
}
