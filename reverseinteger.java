package leetcode;

public class reverseinteger {
    public int reverse(int x) {
        long result = 0;
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            result = result * 10 + digit;
        }
        return (int) (result * sign);
    }
}