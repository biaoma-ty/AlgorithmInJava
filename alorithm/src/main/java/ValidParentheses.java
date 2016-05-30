import java.util.Stack;

/**
 * Created by F7753 on 5/30/16.
 * Given a string containing just the
 * characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * The brackets must close in the correct order,
 * "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '(' || a == '[' || a == '{') {
                stack.push(a);
            } else if (stack.empty()) return false;
            else if ( a == ')' && stack.pop() != '(') return false;
            else if ( a == ']' && stack.pop() != '[') return false;
            else if ( a == '}' && stack.pop() != '{') return false;
        }

        return stack.empty();
    }
}
