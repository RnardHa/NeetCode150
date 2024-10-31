package Stack;

import java.util.Arrays;

public class CarFleet {
    public int solution() {
        return carFleet(10, new int[]{1, 4}, new int[]{3, 2});
    }

    public int carFleet(int target, int[] position, int[] speed) {
        //Transform given input to pairs to be ordered
        double[][] pairs = new double[position.length][2];
        for (int i = 0; i < position.length; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }
        Arrays.sort(pairs, (a, b) -> Double.compare(b[0], a[0]));

        int fleetCount = 0;
        double[] timeToComplete = new double[position.length];
        for (int i = 0; i < pairs.length; i++) {
            var time = (target - pairs[i][0]) / pairs[i][1];
            timeToComplete[i] = time;
            if (i > 0 && timeToComplete[i] <= timeToComplete[i - 1]) {
                timeToComplete[i] = timeToComplete[i - 1];
            } else {
                fleetCount++;
            }
        }
        return fleetCount;
    }

    //if any of the val in the arr is below target then continue
    // while true then continue to move each item until reach target
}
