package Binarrytree;

class Solution {
    public boolean check(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        if (left.val != right.val)
            return false;

        return check(left.left, right.right) && check(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }
}

public class semetry {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Creating a symmetric binary tree for testing
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        boolean isSymmetric = solution.isSymmetric(root);

        if (isSymmetric) {
            System.out.println("The binary tree is symmetric.");
        } else {
            System.out.println("The binary tree is not symmetric.");
        }
    }
}


