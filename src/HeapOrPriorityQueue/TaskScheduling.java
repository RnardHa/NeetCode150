package HeapOrPriorityQueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TaskScheduling {
    public int solution() {
        return leastInterval(new char[]{'X', 'X', 'Y', 'Y'}, 2);
    }

    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for (char c : tasks) {
            count[c - 'A']++;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                maxHeap.offer(-count[i]);
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        int time = 0;
        while (!maxHeap.isEmpty() || !queue.isEmpty()) {
            time++;
            if (!maxHeap.isEmpty()) {
                int task = maxHeap.poll() + 1;
                if (task < 0) {
                    queue.add(new int[]{task, time + n});
                }
            }

            if (!queue.isEmpty() && queue.peek()[1] == time) {
                maxHeap.offer(queue.poll()[0]);
            }
        }
        return time;
    }
}
