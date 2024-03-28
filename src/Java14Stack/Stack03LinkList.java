package Java14Stack;

public class Stack03LinkList {

    /*
    Push O(1)
    Pop O(1)
    Peek O(1)
    Last in First Out
    */

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class StackUsingLinkedList {
        private Node top;

        // Constructor
        public StackUsingLinkedList() {
            this.top = null; // Stack is initially empty
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return (top == null);
        }

        // Push operation
        public void push(int value) {
            Node newNode = new Node(value);
            if (isEmpty()) {
                top = newNode;
            } else {
                newNode.next = top;
                top = newNode;
            }
        }

        // Pop operation
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot pop element.");
                return -1; // or throw an exception
            }
            int poppedValue = top.data;
            top = top.next;
            return poppedValue;
        }

        // Peek operation
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot peek element.");
                return -1; // or throw an exception
            }
            return top.data;
        }

    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        // Pushing elements
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Popping elements
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Peeking element
        System.out.println("Top element: " + stack.peek());

        // Checking if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
