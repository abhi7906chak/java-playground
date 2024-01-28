public class leetcode_58 {
    public static void main(String[] args) {
        String s = "Hello World   ";
        Solution d = new Solution();
        d.lengthOfLastWord(s);
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        // String n = n.split(s);
        s = s.trim();
        int count = 0;
        int len = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(len - i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        // System.out.println(count);

        return count;

    }
}
