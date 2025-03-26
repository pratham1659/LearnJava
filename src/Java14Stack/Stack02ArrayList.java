package Java14Stack;

import java.util.ArrayList;

public class Stack02ArrayList {
    static class StackUsingArrayList {
        static ArrayList<Integer> list = new ArrayList<>();

        // Check if stack is empty
        public boolean isEmpty() {
            return list.size() == 0;
        }

        // Push operation
        public  void push(int data) {
            list.add(data);
        }

        // Pop operation
        public  int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot pop element.");
                return -1; // or throw an exception
            }
            return list.remove(list.size() - 1);
        }

        // Peek operation
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot peek element.");
                return -1; // or throw an exception
            }
            return list.get(list.size() - 1);
        }

        public static void main(String[] args) {
            StackUsingArrayList stack = new StackUsingArrayList();

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
}
