package Java15Queue;

public class Queue01Array {

    static class ArrayQueue {
        private final int[] array;
        private int front; // Front of the queue
        private int rear; // Rear of the queue
        private int size; // Current size of the queue
        private final int capacity; // Maximum capacity of the queue

        // Constructor to initialize the queue
        public ArrayQueue(int capacity) {
            this.capacity = capacity;
            array = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        // Method to add an element to the queue
        public void enqueue(int item) {
            if (isFull()) {
                System.out.println("Queue is full. Cannot enqueue " + item);
                return;
            }
            rear = (rear + 1) % capacity;
            array[rear] = item;
            size++;
        }

        // Method to remove an element from the queue
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue.");
                return -1; // Assuming -1 is not a valid element in the queue
            }
            int dequeuedItem = array[front];
            front = (front + 1) % capacity;
            size--;
            return dequeuedItem;
        }

        // Method to get the front element of the queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty. No front element.");
                return -1; // Assuming -1 is not a valid element in the queue
            }
            return array[front];
        }

        // Method to check if the queue is empty
        public boolean isEmpty() {
            return size == 0;
        }

        // Method to check if the queue is full
        public boolean isFull() {
            return size == capacity;
        }

        // Method to get the size of the queue
        public int size() {
            return size;
        }

    }
    /*
     Add = O(1)
     Peak = O(N)
     Remove = O(N)
            */
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5); // Creating a queue with capacity 5
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element: " + queue.peek());
        System.out.println("Size: " + queue.size());
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60); // This will show queue full message
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Size: " + queue.size());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue()); // This will show queue empty message

    }
}
