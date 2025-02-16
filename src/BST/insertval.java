package BST;

    public class insertval {

        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null) {
                TreeNode node = new TreeNode(val);
                return node;
            }
            if (val < root.val) {
                root.left = insertIntoBST(root.left, val);
            } else {
                root.right = insertIntoBST(root.right, val);
            }
            return root;
        }

        // Helper function to print the inorder traversal of a BST
        public static void inorderTraversal(TreeNode root) {
            if (root != null) {
                inorderTraversal(root.left);
                System.out.print(root.val + " ");
                inorderTraversal(root.right);
            }
        }

        public static void main(String[] args) {
            insertval solution = new insertval();
            TreeNode root = null; // Initialize an empty BST

            // Insert values into the BST
            root = solution.insertIntoBST(root, 50);
            root = solution.insertIntoBST(root, 30);
            root = solution.insertIntoBST(root, 70);
            root = solution.insertIntoBST(root, 20);
            root = solution.insertIntoBST(root, 40);
            root = solution.insertIntoBST(root, 60);
            root = solution.insertIntoBST(root, 80);

            // Print the inorder traversal of the BST to verify the insertion
            System.out.print("Inorder Traversal of BST: ");
            inorderTraversal(root);
        }
    }

