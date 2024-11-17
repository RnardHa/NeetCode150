package Random;

public class PalindromeNumber {
    public boolean solution() {
//        return isPalindrome(122);
        return  anotherSolution(121);
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        var s = String.valueOf(x);
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }

        return true;
    }

    private boolean anotherSolution(int x) {
        if (x < 0) {
            return false;
        }

        int num = reverse(x);

        return x == num;
    }

    private int reverse(int x) {
        int res = 0;

        while (x > 0) {
            var rem = x % 10;
            res = res * 10 + rem;
            x = x / 10;
        }

        return res;
    }
}
