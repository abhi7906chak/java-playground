public class leetcode_29 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.divide(-2147483648, -1));
    }
}

class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        int result = (dividend / divisor);
        return result;
    }
}
