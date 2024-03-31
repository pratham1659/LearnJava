package Java10Collections.LinkedList;

public class Link1Basic {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    //1st Singly LinkedList
    //2nd Doubly LinkedList
    //3rd Circular LinkedList

    public static void display(Node head) {
        while (head != null) { //Displaying The LinkedList
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void insertAtEndViaNode(Node head, int value) {
        Node temp = new Node(value);
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = temp;
    }

    public static void displayRecursive(Node head) {
        if (head == null) return;
        displayRecursive(head.next);
        System.out.print(head.data + " ");
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

        /*
        System.out.println(a.data);
        System.out.println(a.next); // LinkedList.Link1Basic$Node@7a81197d
        System.out.println(a.next.data);
        System.out.println(b); // LinkedList.Link1Basic$Node@7a81197d
        System.out.println(b.data);
        System.out.println(b.next.next);
        System.out.println(c.data);
        System.out.println(c.next); // LinkedList.Link1Basic$Node@5ca881b5

        System.out.println("--------------------");
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);
        */


        insertAtEndViaNode(a, 87);
        display(a);
        System.out.println();
        displayRecursive(a);


    }
}
