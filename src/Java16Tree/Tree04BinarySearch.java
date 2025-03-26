package Java16Tree;

import java.util.ArrayList;

public class Tree04BinarySearch {
    /*
    What is BST (Binary Search Tree)
    a. Left Subtree Nodes < Root
    b. Right Subtree Nodes > Root
    c. Left & Right Subtrees are also
    BST with no duplicates
     */

    /*
    Inorder Traversal of BST gives sorted sequence
    Most problems will be solved using recursion i.e. by
    dividing into sub-problems & making recursive calls
    on subtrees.
    */

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (root.data > value) {
            //left Subtree
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int key) {

        if (root.data > key) {
            root.left = delete(root.left, key);
        } else if (root.data < key) {
            root.right = delete(root.right, key);
        } else {
            //Case 1 No child (Leaf Node) Delete Node & Return Null to parent
            if (root.left == null && root.right == null) {
                return null;
            }

            //Case 2 One Child Delete Node & replace with child node
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            //Case 3 Two Children & Replace value with inorder successor
            //Delete the node for inorder successor
            Node IS = inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node inOrderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int x, int y) {
        if (root == null) {
            return;
        }

        if (root.data >= x && root.data <= y) {
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        } else if (root.data >= y) {
            printInRange(root.left, x, y);
        } else {
            printInRange(root.right, x, y);
        }
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);

        //leaf node
        if(root.left == null && root.right == null){
            printPath(path);
        }else{ //Non-Leaf node
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for (int value : values) {
            root = insert(root, value); //Time Complexity big O(Height);
        }

        System.out.println("InOrder Traversal: ");
        inOrder(root);
        System.out.println();
        System.out.println("PrintInRange in BST: ");
        printInRange(root, 3, 12);
        System.out.println("\nDelete key 10: ");
        delete(root, 10);
        inOrder(root);
        System.out.print("\nSearch of key 7: ");
        if (search(root, 6)) { //Time Complexity big O(Height);
            System.out.println("Node Found");
        } else {
            System.out.println("Node Not Found");
        }
        System.out.println("\nprintRoot2Leaf: ");
        printRoot2Leaf(root, new ArrayList<>());

    }
}
