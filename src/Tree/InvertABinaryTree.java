package Tree;

import Helper.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InvertABinaryTree {
    public TreeNode solution() {
        return invertTree(input());
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return root;

//        if (root == null) {
//            return null;
//        }
//
//        TreeNode node = new TreeNode(root.val);
//        node.right = invertTree(root.left);
//        node.left = invertTree(root.right);
//
//        return node;

//        if (root == null) {
//            return null;
//        }
//
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//
//        while (!stack.isEmpty()) {
//            TreeNode node = stack.pop();
//            TreeNode temp = node.left;
//            node.left = node.right;
//            node.right = temp;
//            if (node.left != null) {
//                stack.push(node.left);
//            }
//            if (node.right != null) {
//                stack.push(node.right);
//            }
//        }
//        return root;
    }

    private TreeNode input() {
        return new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
    }
}
