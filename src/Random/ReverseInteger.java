package Random;

public class ReverseInteger {
    public int solution() {
        return reverse(-2147483648);
    }

    public int reverse(int x) {
        System.out.println(-1%10);
        int num = Math.abs(x);
        long reverse = Long.parseLong(new StringBuilder(String.valueOf(num)).reverse().toString());

        if (x < 0) {
            reverse *= -1;
        }

        if (reverse < Integer.MIN_VALUE|| reverse > Integer.MAX_VALUE) {
            return 0;
        }

        return (int)reverse;
    }
}
