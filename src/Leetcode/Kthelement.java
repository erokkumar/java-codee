package Leetcode;

public class Kthelement {
        int count = 0;
        int out = 0;
        public void recurs(TreeNode node , int k){
            if(node.left != null){
                recurs(node.left ,k);
            }
            count++;
            if(count == k ){
                out = node.val;
                return;
            }
            if(node.right != null){
                recurs(node.right, k);
            }
        }
        public int kthSmallest(TreeNode root, int k) {
            recurs(root , k);
            return out;
        }

    public static void main(String[] args) {
        // Create a sample binary search tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        // Create an instance of the Solution class
        Kthelement solution = new Kthelement();

        // Define the value of k
        int k = 3; // You can change k to any positive integer you want to find the kth smallest element for

        // Call the kthSmallest method to find the kth smallest element
        int result = solution.kthSmallest(root, k);

        // Print the result
        System.out.println("The " + k + "th smallest element in the tree is: " + result);
    }
}
