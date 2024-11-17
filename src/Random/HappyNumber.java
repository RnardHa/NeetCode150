package Random;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean solution() {
        return isHappy(62);
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        while (n != 1) {
            n = getSum(n);
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
        }
        return true;
    }

    private int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem;
            n = n / 10;
        }

        return sum;
    }
}

// while
