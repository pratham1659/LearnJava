package Java11Collections.LinkedList;

public class Link2Problems {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        while (head != null) { //Displaying The LinkedList
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    //Implement a method to find out the length of a
    //Linked List (Iterative and Recursive)
    public static int findLength(Node root) {
        int count = 0;
        while (root != null){
            count++;
            root = root.next;
        }
        return count;
    }

    public static void main(String[] args) {

        Node a = new Node(5); //Head Node
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(18);

        //5 -> 3 -> 9 -> 8 -> 18
        a.next = b; // 5 -> 3
        b.next = c; // 5 →> 3 -> 9
        c.next = d; // 5 -> 3 -> 9 -> 8
        d.next = e; // 5 -> 3 -> 9 -> 8 - > 16

        System.out.println("Length Of LinkList: " +  findLength(a));

    }
}
