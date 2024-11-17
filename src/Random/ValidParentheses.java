package Random;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean solution() {
        return isValid("()");
    }

    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (!map.containsKey(s.charAt(i))) {
                stack.add(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (map.get(s.charAt(i)) != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
