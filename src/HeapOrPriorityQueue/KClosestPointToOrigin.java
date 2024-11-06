package HeapOrPriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointToOrigin {
    public int[][] solution() {
        return kClosest(new int[][]{{0, 2}, {2, 0}, {2, 2}}, 2);
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparing(a -> a[0]));

        for (int[] point : points) {
            int distance = point[0] * point[0] + point[1] * point[1];
            minHeap.offer(new int[]{distance, point[0], point[1]});
        }

        int[][] res = new int[k][2];
        for (int i = 0; i < k; i++) {
            var min = minHeap.poll();
            res[i] = new int[]{min[1], min[2]};
        }

        return res;
    }
}
