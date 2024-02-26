import java.util.Stack;

public class leetcode {
    public static void main(String[] args) {
        solution s = new solution();
        // s.isvalid();
        System.out.println(s.isvalid());
        // s.peek();
        // System.out.println(s.peek());
    }

}

class solution {
    Stack<String> stk = new Stack<String>();
    // Stack<String> stk2 = new Stack<String>();
    String exp = "()({})[]";
    
    boolean isvalid() {
        for (int i = 0; i < exp.length(); i++) {

            String data = String.valueOf(exp.charAt(i));
            if (data.equals("(")
                    || data.equals("{")
                    || data.equals("[")) {
                stk.push(data);
            } else if (data.equals(")")
                    || data.equals("}")
                    || data.equals("]")) {
                if (stk.isEmpty() || !ismathing(stk.pop(), data)) {
                    return false;
                }
            }
        }
        // System.out.println(stk);
        // System.out.println(stk2);
        return stk.isEmpty();
    }

    boolean ismathing(String opening, String closing) {
        return (opening.equals("(") && closing.equals(")")) ||
                (opening.equals("{") && closing.equals("}")) ||
                (opening.equals("[") && closing.equals("]"));
    }

    String peek() {
        return stk.peek();
    }

    public int removeDuplicates(int[] nums) {
        
        throw new UnsupportedOperationException("Unimplemented method 'removeDuplicates'");
    }
}
