import java.util.Stack;

public class leetcode_27 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 4, 5 };
        Solution s = new Solution();
        int newLength = s.removeElement(nums, 2);
        System.out.println(newLength);
        // Print the modified array
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

class Solution {
    Stack<Integer> stk = new Stack<>();

    public int removeElement(int[] nums, int val) {
        // int[] nums = { 1, 1, 2, 3, 4, 5 };
        // val =1;
        int index = 0;
       
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            } else {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
