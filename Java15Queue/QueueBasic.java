package Java15Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {
    public static void main(String[] args) {

        Queue<Integer> queue  = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Front element: " + queue.peek());
        System.out.println("Size: " + queue.size());



    }
}
