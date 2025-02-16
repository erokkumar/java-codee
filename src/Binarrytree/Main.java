package Binarrytree;

import java.util.ArrayList;
import java.util.List;

class node {
    public int val;
    public List<node> children;

    public node() {
        children = new ArrayList<>();
    }

    public node(int _val) {
        val = _val;
        children = new ArrayList<>();
    }

    public node(int _val, List<node> _children) {
        val = _val;
        children = _children;
    }
}

class narraytree {
    public void dfs(node root, List<Integer> list) {
        if (root == null) return;

        for (node child : root.children) {
            dfs(child, list);
        }
        list.add(root.val);
    }

    public List<Integer> postorder(node root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating the tree
        node root = new node(1);
        node child1 = new node(3);
        node child2 = new node(2);
        node child3 = new node(4);

        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);

        node child4 = new node(5);
        node child5 = new node(6);

        child1.children.add(child4);
        child1.children.add(child5);

        // Creating Solution instance and performing postorder traversal
        narraytree solution = new narraytree();
        List<Integer> result = solution.postorder(root);

        // Printing the result
        System.out.println(result);
    }
}
