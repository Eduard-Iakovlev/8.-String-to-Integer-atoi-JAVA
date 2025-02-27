
public class Solution {
    private static final int INT_MIN = -2147483648, INT_MAX = 2147483647;

    public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        int result = 0;

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            if (result > INT_MAX / 10 || (result == INT_MAX / 10 && s.charAt(i) - '0' > 7)) {
                if (sign == 1) {
                    return INT_MAX;
                }
                else {
                    return INT_MIN;
                }
            }
            result = result * 10 + (s.charAt(i) - '0');
            i++;
        }
        return result * sign;
    }
}

