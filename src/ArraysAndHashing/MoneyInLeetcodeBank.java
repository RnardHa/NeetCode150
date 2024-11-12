package ArraysAndHashing;

public class MoneyInLeetcodeBank {
    public int solution() {
        return totalMoney(20);
    }

    public int totalMoney(int n) {
        int[] baseAmount = new int[]{1,2,3,4,5,6,7};
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += baseAmount[i % 7] + i / 7;
        }

        return sum;
    }
}
