import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class leetcoe_1207 {
    public static void main(String[] args) {
        // int[] arr = { 4, 0, 2, -5, -4 };
        int[] arr = { 1, 2, 2, 1, 1, 3 };
        Solution s = new Solution();
        System.out.println(s.uniqueOccurrences(arr));
    }
}

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            h.put(num, h.getOrDefault(num, 0) + 1);
        }
        Set<Integer> s = new HashSet<>(h.values());
        return s.size() == h.size();

    }
}