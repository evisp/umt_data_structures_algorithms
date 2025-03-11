import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expr.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // Push opening bracket
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false; // No matching opening bracket
                char top = stack.pop();

                // Check for matching pair
                if (!isMatching(top, ch)) return false;
            }
        }
        return stack.isEmpty(); // Stack should be empty if balanced
    }

    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') || 
               (open == '{' && close == '}') || 
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String expression = "{[()]}";  
       
        System.out.println(expression + " -> " + isBalanced(expression)); 
    }
}
