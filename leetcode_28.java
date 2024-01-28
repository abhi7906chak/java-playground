public class leetcode_28 {
    public static void main(String[] args) {
        // String one = "sadbutsad";
        // String two = "sad";
        // String one = "leetcode";
        // String two = "leeto";
        String one = "hello";
        String two = "ll";
        Solution s = new Solution();
        int r = s.strStr(one, two);
        System.out.println(r);
    }
}

class Solution {
    public int strStr(String haystack, String needle) {
        // String newNeedle = "";
        // int[] arr = new int[10];
        // for (int i = 0; i < needle.length(); i++) {

        // }
        return haystack.indexOf(needle);
        // if (haystack.contains(needle)) {

        // } else {
        // return -1;
        // }
        // return arr[0];
    }
}
