import java.util.Stack;

public class leetcode_26 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 4, 5 };
        Solution s = new Solution();
        int newLength = s.removeDuplicates(nums);
        System.out.println(newLength);
        // Print the modified array
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

class Solution {
    Stack<Integer> stk = new Stack<>();
    int n;

    int newIndex = 0;
    public int removeDuplicates(int[] nums) {
        // int[] nums = { 1, 1, 2, 3, 4, 5 };

        for (int i = 0; i < nums.length; i++) {
            n = nums[i];
            if (!checkElement(n)) {
                nums[newIndex++] = nums[i];
                stk.push(n);
            }
        }

        return newIndex;
    }
  
    boolean checkElement(int num) {
        return stk.search(num) != -1;
    }
}
