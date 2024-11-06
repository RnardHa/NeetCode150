package HeapOrPriorityQueue;

import java.util.PriorityQueue;

public class KthLargestElementInArray {

    public int solution() {
        return findKthLargest(new int[]{2,3,1,5,4}, 2);
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
