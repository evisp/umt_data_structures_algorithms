import java.util.*;

public class BinarySearchTree<T extends Comparable<T>> {
    
	private Node<T> root;

    public void insert(T value) {
        root = insertRecursive(root, value);
    }

    private Node<T> insertRecursive(
    		Node<T> current, T value) {
    	
        if (current == null) 
        	return new Node<>(value);

        if (value.compareTo(current.data) < 0) {
            current.left = insertRecursive(current.left, value);
        } else if (value.compareTo(current.data) > 0) {
            current.right = insertRecursive(current.right, value);
        }
        return current;
    }

    public boolean contains(T value) {
        return containsRecursive(root, value);
    }

    private boolean containsRecursive(Node<T> current, T value) {
        if (current == null) 
        	return false;

        if (value.compareTo(current.data) == 0) 
        	return true;
        if (value.compareTo(current.data) < 0) 
        	return containsRecursive(current.left, value);
        else 
        	return containsRecursive(current.right, value);
    }

    public void inOrderTraversal() {
        inOrderRecursive(root);
        System.out.println();
    }

    private void inOrderRecursive(Node<T> node) {
        if (node != null) {
            inOrderRecursive(node.left);
            System.out.print(node.data + " ");
            inOrderRecursive(node.right);
        }
    }
    
 // Pre-order: Root, Left, Right
    public void preOrderTraversal() {
        preOrderRecursive(root);
        System.out.println();
    }

    private void preOrderRecursive(Node<T> node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderRecursive(node.left);
            preOrderRecursive(node.right);
        }
    }

    // Post-order: Left, Right, Root
    public void postOrderTraversal() {
        postOrderRecursive(root);
        System.out.println();
    }

    private void postOrderRecursive(Node<T> node) {
        if (node != null) {
            postOrderRecursive(node.left);
            postOrderRecursive(node.right);
            System.out.print(node.data + " ");
        }
    }

    public T findMin() {
        if (root == null) throw new IllegalStateException("Tree is empty");
        Node<T> current = root;
        while (current.left != null) 
        	current = current.left;
        return current.data;
    }

    public T findMax() {
        if (root == null) throw new IllegalStateException("Tree is empty");
        Node<T> current = root;
        while (current.right != null) current = current.right;
        return current.data;
    }

    public int height() {
        return heightRecursive(root);
    }

    private int heightRecursive(Node<T> node) {
        if (node == null) return -1; // height of empty tree is -1
        return 1 + Math.max(heightRecursive(node.left), heightRecursive(node.right));
    }
    
    public int countNodes() {
        return countNodesRecursive(root);
    }

    private int countNodesRecursive(Node<T> node) {
        if (node == null) return 0;
        return 1 + countNodesRecursive(node.left) + countNodesRecursive(node.right);
    }

    public int countLeaves() {
        return countLeavesRecursive(root);
    }

    private int countLeavesRecursive(Node<T> node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeavesRecursive(node.left) + countLeavesRecursive(node.right);
    }

    public int countInternalNodes() {
        return countInternalRecursive(root);
    }

    private int countInternalRecursive(Node<T> node) {
        if (node == null || (node.left == null && node.right == null)) return 0;
        return 1 + countInternalRecursive(node.left) + countInternalRecursive(node.right);
    }
    
    public int getDepth(T value) {
        return getDepthRecursive(root, value, 0);
    }

    private int getDepthRecursive(Node<T> node, T value, int depth) {
        if (node == null) return -1;

        int cmp = value.compareTo(node.data);
        if (cmp == 0) return depth;
        if (cmp < 0) return getDepthRecursive(node.left, value, depth + 1);
        else return getDepthRecursive(node.right, value, depth + 1);
    }



    public boolean isBalanced() {
        return checkBalance(root) != -1;
    }

    private int checkBalance(Node<T> node) {
        if (node == null) return 0;

        int leftHeight = checkBalance(node.left);
        if (leftHeight == -1) return -1;

        int rightHeight = checkBalance(node.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public void delete(T value) {
        root = deleteRecursive(root, value);
    }

    private Node<T> deleteRecursive(Node<T> current, T value) {
        if (current == null) return null;

        int cmp = value.compareTo(current.data);
        if (cmp < 0) {
            current.left = deleteRecursive(current.left, value);
        } else if (cmp > 0) {
            current.right = deleteRecursive(current.right, value);
        } else {
            // Node with one or no children
            if (current.left == null) return current.right;
            if (current.right == null) return current.left;

            // Node with two children: Get inorder successor (min in right subtree)
            T smallest = findMin(current.right);
            current.data = smallest;
            current.right = deleteRecursive(current.right, smallest);
        }
        return current;
    }

    private T findMin(Node<T> node) {
        while (node.left != null) node = node.left;
        return node.data;
    }
    
    public boolean isValidBST() {
        return isValidBSTRecursive(root, null, null);
    }

    private boolean isValidBSTRecursive(Node<T> node, T min, T max) {
        if (node == null) return true;

        if ((min != null && node.data.compareTo(min) <= 0) ||
            (max != null && node.data.compareTo(max) >= 0)) {
            return false;
        }

        return isValidBSTRecursive(node.left, min, node.data) &&
               isValidBSTRecursive(node.right, node.data, max);
    }
    
    public List<T> pathToNode(T value) {
        List<T> path = new ArrayList<>();
        if (findPath(root, value, path)) return path;
        return Collections.emptyList(); // not found
    }

    private boolean findPath(Node<T> node, T value, List<T> path) {
        if (node == null) return false;

        path.add(node.data);

        int cmp = value.compareTo(node.data);
        if (cmp == 0) return true;
        if (cmp < 0 && findPath(node.left, value, path)) return true;
        if (cmp > 0 && findPath(node.right, value, path)) return true;

        path.remove(path.size() - 1); // backtrack
        return false;
    }



    public void printTree() {
        printTreeRecursive(root, "", true);
    }

    private void printTreeRecursive(Node<T> node, String prefix, boolean isTail) {
        if (node == null) return;

        System.out.println(prefix + (isTail ? "└── " : "├── ") + node.data);

        if (node.left != null || node.right != null) {
            if (node.right != null) {
                printTreeRecursive(node.right, prefix + (isTail ? "    " : "│   "), false);
            }
            if (node.left != null) {
                printTreeRecursive(node.left, prefix + (isTail ? "    " : "│   "), true);
            }
        }
    }


}
