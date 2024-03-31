package Java10Collections.LinkedList;

public class Link3Implementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int val) { //Time Complexity O(1), Space complexity O(1)
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp; // Update the tail reference to the newly inserted node
            }
            size++;
        }

        void insertAtHead(int val) { //Time Complexity O(1), Space complexity O(1)
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp; // Update the head reference to the newly inserted node
            }
            size++;
        }

        void insertAtIndex(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Wrong Index");
                return;
            }

            Node newNode = new Node(val);
            if (idx == 0) {
                newNode.next = head;
                head = newNode;
                return;
            }

            Node temp = head;
            int count = 0;
            while (temp != null && count < idx - 1) {
                temp = temp.next;
                count++;
            }

            if (temp == null) {
                System.out.println("Index out of bounds");
                return;
            }

            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() { //Time Complexity O(N), Space complexity O(1)
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        int getElementAtIndex(int idx) { //Time Complexity O(N), Space complexity O(1)
            if (idx < 0 || idx > size) {
                System.out.println("Wrong Index");
                return -1;
            }

            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAtIndex(int idx){
            if (idx < 0 || idx > size) {
                System.out.println("Wrong Index");
                size--;
                return;
            }

            if (idx == 0) {
                head = head.next;
                return;
            }

            Node temp = head;
            for(int i =1; i<=idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtEnd(1); //1 ->
        ll.insertAtEnd(2); //1 -> 2
        ll.insertAtEnd(3); //1 -> 2 -> 3
        ll.insertAtEnd(4); //1 -> 2 -> 3 -> 4
        ll.display();
        System.out.println("Length : " + ll.size()); // 4
        ll.insertAtEnd(9);  //1 -> 2 -> 3 -> 4 -> 9
        ll.display();
        System.out.println("New Length : " + ll.size()); // 5
        ll.insertAtHead(11);  //11 -> 1 -> 2 -> 3 -> 4 -> 9
        ll.display();
        System.out.println("New Length : " + ll.size()); // 6
        ll.insertAtIndex(5, 10); //1 -> 2 -> 3 -> 10 -> 4
        System.out.println("Insert Node at Index 5 is 10: ");
        ll.display();
        System.out.println("Tail Pointer At: " + ll.tail.data);
        System.out.println("Get Element at Idx at 5: " + ll.getElementAtIndex(0));
        System.out.println("Size of the List: " + ll.size);
        System.out.println("Delete At Index 1: ");
        ll.display();
        ll.deleteAtIndex(0);
        ll.display();
        System.out.println("Size of the List: " + ll.size);


    }
}
