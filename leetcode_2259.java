// Ho nhi Paya

public class leetcode_2259 {

    public static void main(String[] args) {
        Solution s = new Solution();
        String n = s.removeDigit("12323", '2');
        System.out.println("k");
        System.out.println(n);
    }
}

class Solution {
    public String removeDigit(String number, char digit) {
        boolean flag = true;
        boolean flag2 = true;
        String num = "";
        String num2 = "";
        // reverse(number);
        int l = number.length();
        for (int i = 0; i < number.length(); i++) {
            if (flag) {
                if (number.charAt(i) == digit) {
                    flag = false;
                } else {
                    num += number.charAt(i);
                }

            } else {
                num += number.charAt(i);
            }
        }
        for (int i = l - 1; i < number.length(); i++) {
            if (flag2) {
                if (number.charAt(i) == digit) {
                    flag = false;
                } else {
                    num2 += number.charAt(i);
                }

            } else {
                num2 += number.charAt(i);
            }
        }
        if (Integer.parseInt(num) > Integer.parseInt(num2)) {
            return num;
        }
        return num2;
    }
}