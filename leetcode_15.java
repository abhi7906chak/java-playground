import java.util.ArrayList;
import java.util.List;

public class leetcode_15 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = s.threeSum(nums);
        System.out.println(result);
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 2; i < nums.length; i++) {
            for (int j = i; j < nums.length - 1; j++) {
                for (int k = j; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> a = new ArrayList<>();
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[k]);
                        // result.add(a);
                        if (!result.contains(a)) {
                            result.add(a);
                        }

                    }
                }
            }
        }
        return result;
    }
}
