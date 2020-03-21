/*
 *  BST class
 */
public class BST {

    // Node inner class
    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Method to insert value
    public void insert(int value) {
        this.root = insertRecursive(this.root, value);
    }

    // Method to insert value recursively
    private Node insertRecursive(Node node, int value) {
        if (node == null)
            return new Node(value);
        else if (value < node.value)
            node.left = insertRecursive(node.left, value);
        else if (value > node.value)
            node.right = insertRecursive(node.right, value);
        else
            node.value = value;
        return node;
    }

    // Method to calculate height
    public int height() {
        return heightRecursive(this.root);
    }

    // Method to calculate height recursively
    private int heightRecursive(Node node) {
        if (node == null)
            return 0;
        else
            return 1 + Math.max(heightRecursive(node.left), heightRecursive(node.right));
    }

}