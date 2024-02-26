import java.util.Arrays;

public class leetcode_121 {
    public static void main(String[] args) {
        // int[] arr = { 7, 1, 5, 3, 6, 4 };
        // int[] arr = { 7, 6, 4, 3, 1 };
        // int[] arr = { 1, 2 };
        int[] arr = { 2, 1 };
        Solution s = new Solution();
        // s.maxProfit(arr);
        // for (int i : a) {
        // System.out.print(i + " ");
        // }
        // System.out.println(a[0]);
        System.out.println(" | " + s.maxProfit(arr));

    }

}

class Solution {
    public int maxProfit(int[] prices) {
        int[] arr = Arrays.copyOf(prices, prices.length);
        int l = prices.length;
        // System.out.println(l);

        Arrays.sort(prices);
        int index = 0;
        int[] narr = Arrays.copyOfRange(arr, 1, l);
        Arrays.sort(narr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prices[0]) {
                index = i;
                // break;
            }
            if (index == 0) {
                index = i + 1;
            }
        }
        System.out.println(l);
        System.out.println(index);
        System.out.println(prices[0]);
        // if (prices.length < 2) {
        if (prices.length == 2) {
            if (arr[0] == 1) {

                return l - prices[0];
            } else {
                return 0;
            }

        }
        if (prices.length < 2 || index == l - 1) {
            return 0;
        }
        // }
        System.out.println("3");
        for (int i : narr) {
            System.out.print(" " + i);
        }
        // if (index == l) {
        // return 0; // No profit can be made in decreasing order
        // }

        // System.out.println("index " + index);
        // for (int i : narr) {
        // System.out.print(i + " ");
        // }
        return narr[narr.length - 1] - index;
    }
}
