public class leetcode_66 {
    public static void main(String[] args) {
        int[] digits = { 1, 2, 2 };
        Solution s = new Solution();
        int[] result = s.plusOne(digits);
        // s.plusOne(digits);
        for (int i : result) {
            System.out.println(i);
        }
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int[] nd = new int[len + 1];
        System.arraycopy(digits, 0, nd, 0, len);
        // for (int i : nd) {
        // System.out.println(i);
        // }

        if (digits[len - 1] == 9) {
            // If the last digit is 9, create a new array with an extra digit for the
            // carry
            // nd = new int[len + 2];
            nd[len - 1] = 1;
            // nd[len+1] = 0;
        } else {
            // If the last digit is not 9, increment it and return the original array
            digits[len - 1] += 1;
            return digits;
        }

        // Copy the original digits to the new array
        return nd;
    }
}
