package Binarrytree;

    class TreeNode{
        int val;
       TreeNode left;
        TreeNode right;
       TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
public class postorder {
    public static void main(String[] args) {
               TreeNode root = new TreeNode(1);
               TreeNode left = new TreeNode(2);
               TreeNode right = new TreeNode(3);
               root.left = left;
               root.right = right;
        System.out.println(root.val);
    }
}
