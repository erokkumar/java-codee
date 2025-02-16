package BST;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class validitybinary {
    public boolean check(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }

        if (root.val <= min || root.val >= max) {
            return false;
        }

        return check(root.left, min, root.val) && check(root.right, root.val, max);
    }

    public boolean isValidBST(TreeNode root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        // Create an instance of the Solution class
        validitybinary solution = new validitybinary();

        // Check if the tree is a valid BST
        boolean isValid = solution.isValidBST(root);

        // Output the result
        if (isValid) {
            System.out.println("The tree is a valid BST.");
        } else {
            System.out.println("The tree is not a valid BST.");
        }
    }
}
