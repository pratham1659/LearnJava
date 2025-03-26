package Java15Queue;

public class Queue03LinkList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedListQueue {
        private Node front; // Front of the queue
        private Node rear; // Rear of the queue

        // Constructor to initialize the queue
        public LinkedListQueue() {
            front = null;
            rear = null;
        }

        // Method to add an element to the queue
        public void enqueue(int item) {
            Node newNode = new Node(item);
            if (isEmpty()) {
                front = newNode;
            } else {
                rear.next = newNode;
            }
            rear = newNode;
        }

        // Method to remove an element from the queue
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue.");
                return -1; // Assuming -1 is not a valid element in the queue
            }
            int dequeuedItem = front.data;
            if (front == rear) {
                front = null;
                rear = null;
            } else {
                front = front.next;
            }
            return dequeuedItem;
        }

        // Method to get the front element of the queue
        public int front() {
            if (isEmpty()) {
                System.out.println("Queue is empty. No front element.");
                return -1; // Assuming -1 is not a valid element in the queue
            }
            return front.data;
        }

        // Method to check if the queue is empty
        public boolean isEmpty() {
            return front == null && rear == null;
        }

        public static void main(String[] args) {
            LinkedListQueue queue = new LinkedListQueue(); // Creating an empty queue
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            System.out.println("Front element: " + queue.front());
            System.out.println("Dequeued: " + queue.dequeue());
            System.out.println("Front element: " + queue.front());
            queue.enqueue(40);
            System.out.println("Dequeued: " + queue.dequeue());
            System.out.println("Dequeued: " + queue.dequeue());
            System.out.println("Dequeued: " + queue.dequeue());
            System.out.println("Dequeued: " + queue.dequeue()); // This will show queue empty message
        }
    }
}
