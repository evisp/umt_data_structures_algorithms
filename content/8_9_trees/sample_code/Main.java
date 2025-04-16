import java.util.*;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.print("In-order: ");
        bst.inOrderTraversal();

        System.out.print("Pre-order: ");
        bst.preOrderTraversal();

        System.out.print("Post-order: ");
        bst.postOrderTraversal();

        System.out.println("Min: " + bst.findMin());
        System.out.println("Max: " + bst.findMax());
        System.out.println("Height: " + bst.height());
        System.out.println("Is Balanced: " + bst.isBalanced());
        System.out.println("Total nodes: " + bst.countNodes());
        System.out.println("Leaf nodes: " + bst.countLeaves());
        System.out.println("Internal nodes: " + bst.countInternalNodes());

        System.out.println("Is valid BST? " + bst.isValidBST());
        System.out.println("Depth of 40: " + bst.getDepth(40));

        List<Integer> path = bst.pathToNode(60);
        System.out.println("Path to 60: " + path);

        System.out.println("Tree:");
        bst.printTree();

        System.out.println("Deleting 70...");
        bst.delete(70);
        System.out.println("In-order after deletion: ");
        bst.inOrderTraversal();
        System.out.println("Tree:");
        bst.printTree();
    }
}
