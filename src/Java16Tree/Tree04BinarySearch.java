package Java16Tree;

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

    public static Node insert(Node root, int value){
        if(root==null){
            root = new Node(value);
            return root;
        }

        if(root.data>value) {
            //left Subtree
            root.left =  insert(root.left, value);
        }else{
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



    public static void main(String[] args) {

        int[] values = {5, 1, 3, 4, 6, 2, 7};
        Node root = null;

        for (int value : values) {
            root = insert(root, value); //Time Complexity big O(Height);
        }

        inOrder(root);
        System.out.println();
    }
}
