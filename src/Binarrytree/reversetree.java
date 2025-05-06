package Binarrytree;

public class reversetree {
    //Abstract class for a binary tree node
    static class Node {
        // Data of the node
        int data;
        Node left, right;
        // Constructor
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    // Root of the binary tree
    Node root;

    // Function to reverse the binary tree
    void reverseTree(Node node) {
        if (node == null) {
            return;
        }

        // Swap the left and right children
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        // Recursively call for the left and right subtrees
        reverseTree(node.left);
        reverseTree(node.right);
    }

    void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }



    public static void main(String[] args) {
        reversetree tree = new reversetree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal of the original tree:");
        tree.printInOrder(tree.root);

        tree.reverseTree(tree.root);

        System.out.println("\nInorder traversal of the reversed tree:");
        tree.printInOrder(tree.root);
    }

}
