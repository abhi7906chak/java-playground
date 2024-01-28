//This is nothing but a fibonachi series

// 14/01/2024
public class leetcode_70 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int c = s.climbStairs(3);
        System.out.println(c);

    }
}

class Solution {
    public int climbStairs(int n) {
        int first = 0, last = 1;
        // if (n <= 3) {
        //     return n;
        // }
        for (int i = 0; i < n; i++) {
            int r = first + last;
            first = last;
            last = r;
        }
        return last;
    }

}