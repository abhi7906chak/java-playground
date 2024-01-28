public class leetcode_7 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int c = s.reverse(123);
        System.out.println(c);
    }
}

class Solution {
    public int reverse(int x) {
        // String m = "-";
        int num = 0, result = 0;

        while (x != 0) {
            num = x % 10;
            if (result > Integer.MAX_VALUE / 10) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10) {
                return 0;
            }
            result = result * 10 + num;
            x /= 10;
        }

        return result;
    }
}
