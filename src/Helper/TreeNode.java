package Helper;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public List<Integer> toList(){
//        List<Integer> vals = new ArrayList<>();
//
//        if (this == null) {
//            return null;
//        }
        return new ArrayList<>();
    }
}