package HeapOrPriorityQueue;

import java.util.PriorityQueue;

public class LastStoneWeight {
    public int solution() {
        return lastStoneWeight(new int[]{2,3,6,2,4});
    }

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : stones) {
            minHeap.offer(num * -1);
        }

        while (minHeap.size() > 1) {
            int large = minHeap.poll(); //largest
            int small = minHeap.poll(); //2nd largest
            if (large < small) {
                minHeap.offer(large - small);
            } else if (large == small) {
                minHeap.offer(0);
            }
        }

        return Math.abs(minHeap.peek());
    }
}
