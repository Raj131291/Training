import java.util.Stack;

public class ParenthesisValidator {
    public static boolean isValid(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // If the character is a closing bracket
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '[' && closing == ']') ||
               (opening == '{' && closing == '}');
    }

    public static void main(String[] args) {

        String[] testExpressions = {
            "(a + (b - c) + z) - z)", // extra closing
            "(a + (b - c) + z - z)", // valid
            "((a + (b - c) + z - z)", // extra opening
            "(a + {b - c} + z)", // bracket types do not match
            "y + (a + (b - c) + z - z)" // valid
        };

        for (String expression : testExpressions) {
            System.out.println("Expression: " + expression + " is " + (isValid(expression) ? "valid" : "invalid"));
        }
    }
}