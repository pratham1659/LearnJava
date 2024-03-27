package Temp;

import java.util.*;

class Test {
    public long end;
    public int roomId;

    public Test(long end, int roomId) {
        this.end = end;
        this.roomId = roomId;
    }
}

public class MeetingRoomScheduler {
    public static int mostBooked(int n, int[][] meetings) {
        int[] count = new int[n];

        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        Queue<Test> occQueue = new PriorityQueue<>(
                (a, b) -> a.end == b.end ? Integer.compare(a.roomId, b.roomId)
                        : Long.compare(a.end, b.end));
        Queue<Integer> availableRooms = new PriorityQueue<>();

        for (int i = 0; i < n; ++i)
            availableRooms.offer(i);

        for (int[] meeting : meetings) {
            final int start = meeting[0];
            final int end = meeting[1];
            while (!occQueue.isEmpty() && occQueue.peek().end <= start)
                availableRooms.offer(occQueue.poll().roomId);
            if (availableRooms.isEmpty()) {
                Test t = occQueue.poll();
                ++count[t.roomId];
                occQueue.offer(new Test(t.end + (end - start), t.roomId));
            } else {
                final int roomId = availableRooms.poll();
                ++count[roomId];
                occQueue.offer(new Test(end, roomId));
            }
        }

        int index = 0;
        for (int i = 0; i < n; ++i)
            if (count[i] > count[index])
                index = i;
        return index;
    }

    public static void main(String[] args) {
        int n1 = 2;
        int[][] meetings1 = { { 0, 10 }, { 1, 5 }, { 2, 7 }, { 3, 4 } };
        System.out.println(mostBooked(n1, meetings1)); // Output: 0

        int n2 = 3;
        int[][] meetings2 = { { 1, 20 }, { 2, 10 }, { 3, 5 }, { 4, 9 }, { 6, 8 } };
        System.out.println(mostBooked(n2, meetings2)); // Output: 1
    }
}
