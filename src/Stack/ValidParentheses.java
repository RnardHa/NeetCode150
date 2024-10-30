package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean solution() {
        return isValid("[]");
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');

        for (int i = 0; i < s.length(); i++) {
            if (!brackets.containsValue(s.charAt(i))) {
                stack.add(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    var item = stack.pop();
                    if (s.charAt(i) == '}' && item != '{') {
                        return false;
                    } else if (s.charAt(i) == ']' && item != '[') {
                        return false;
                    } else if (s.charAt(i) == ')' && item != '(') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
