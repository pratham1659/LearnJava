package Java16Tree;

public class Tree03Basic {
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

    public static class BinaryTree {
        static int index = -1;

        public Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = countOfNodes(root.left);
        int rightNode = countOfNodes(root.right);

        return leftNode + rightNode + 1;
    }

    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }


    public static int heightOfNode(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = heightOfNode(root.left);
        int rightHeight = heightOfNode(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static class TreeInfo{
        int height;
        int diameter;

        TreeInfo(int height, int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeInfo diameter(Node root){
        if(root == null){
           return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);

        int myHeight = Math.max(left.height, right.height) + 1;

        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int newDiam = left.height + right.height + 1;

        int myDiam = Math.max(Math.max(diam1, diam2), newDiam);

        return new TreeInfo(myHeight, myDiam);

    }

    public static int diameterOfNode(Node root){
        if(root == null){
            return 0;
        }

        int leftDiam = diameterOfNode(root.left);
        int rightDiam = diameterOfNode(root.right);
        int newDiam = heightOfNode(root.left) + heightOfNode(root.right) + 1;

        return Math.max(newDiam, Math.max(leftDiam, rightDiam));
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.print("Count of Nodes: ");
        System.out.println(countOfNodes(root)); // Time Complexity Big - O(N)
        System.out.print("Sum of Nodes: ");
        System.out.println(sumOfNodes(root)); // Time Complexity Big - O(N)
        System.out.print("Height of Nodes: ");
        System.out.println(heightOfNode(root)); // Time Complexity Big - O(N)
        System.out.print("Longest Diameter of Nodes: ");
        System.out.println(diameter(root).diameter); // Time Complexity Big - O(N)
        System.out.print("Longest Diameter of Nodes: ");
        System.out.println(diameterOfNode(root)); // Time Complexity Big - O(NxN)






    }
}
