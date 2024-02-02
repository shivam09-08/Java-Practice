public class BalancedParenthesis {
    /**
     * @param s
     * @return
     */
    public static boolean isBalanced(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '['))) {
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "({[()]})";
        if (isBalanced(s)) {
            System.out.println(s + "is Balanced paranthesis");
        } else {
            System.out.println(s + "is not a  Balanced paranthesis");

        }
    }

}
