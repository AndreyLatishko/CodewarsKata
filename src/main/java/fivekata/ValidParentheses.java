package fivekata;

public class ValidParentheses {
    public static boolean validParentheses(String parens)
    {
        int count = 0;
        for (char c: parens.toCharArray()) {
            if (c == '(') count++;
            if (c == ')') count--;
            if (count < 0) return false;
        }
       return  count == 0;
    }
}
