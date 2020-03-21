/*
 *  RBT class
 */
public class RBT {

    // Node inner class
    class Node {

        int value;
        Node left;
        Node right;
        boolean isRed;

        public Node(int value) {
            this.value = value;
            this.isRed = true;
        }

    }

    private Node root;

    // Method to insert value
    public void insert(int value) {
        this.root = insertRecursive(this.root, value);
        this.root.isRed = false;
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

        if (isRed(node.right) && !isRed(node.left))
            node = rotateLeft(node);
        if (isRed(node.left) && isRed(node.left.left))
            node = rotateRight(node);
        if (isRed(node.left) && isRed(node.right))
            recolor(node);

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

    // Helper method to get if node is Red
    public static boolean isRed(Node node) {
        if (node == null)
            return false;
        else
            return node.isRed;
    }

    // Helper method to rotate node left
    private Node rotateLeft(Node node) {
        Node temp = node.right;
        node.right = temp.left;
        temp.left = node;
        temp.isRed = temp.left.isRed;
        temp.left.isRed = true;
        return temp;
    }

    // Helper method to rotate node right
    private Node rotateRight(Node node) {
        Node temp = node.left;
        node.left = temp.right;
        temp.right = node;
        temp.isRed = temp.right.isRed;
        temp.right.isRed = true;
        return temp;
    }

    // Helper method to recolor node
    private void recolor(Node node) {
        node.isRed = !node.isRed;
        node.left.isRed = !node.left.isRed;
        node.right.isRed = !node.right.isRed;
    }
}