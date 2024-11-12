package Tree;

import Helper.TreeNode;

import java.util.*;

public class SubtreeOfABinTree {
    public boolean solution() {
        return isSubtree(input1(), input2());
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        //DFS
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        List<Integer> list = new ArrayList<>();

        while (!stack.isEmpty()) {
            var node = stack.pop();
            if (node != null) {
                list.add(node.val);
                stack.push(node.right);
                stack.push(node.left);
            }
        }

//        list.forEach(System.out::println);

        Stack<TreeNode> subStack = new Stack<>();
        subStack.push(subRoot);
        List<Integer> subList = new ArrayList<>();

        while(!subStack.isEmpty()) {
            var node = subStack.pop();
            if (node != null) {
                subList.add(node.val);
                subStack.push(node.right);
                subStack.push(node.left);
            }
        }

//        subList.forEach(System.out::println);

        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(list.get(i), subList.get(index))) {
                index = i;
                break;
            }
        }

        for (Integer integer : subList) {
            if (!Objects.equals(integer, list.get(index++))) {
                return false;
            }
        }

        return true;
    }

    private TreeNode input1() {
        return new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
    }

    private TreeNode input2() {
        return new TreeNode(2, new TreeNode(4), new TreeNode(5));
    }
}
