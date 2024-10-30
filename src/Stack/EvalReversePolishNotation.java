package Stack;

import java.util.Stack;

public class EvalReversePolishNotation {
    public int solution() {
        return evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"});
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                var second = stack.pop();
                var first = stack.pop();
                stack.push(first + second);
            } else if (token.equals("-")) {
                var second = stack.pop();
                var first = stack.pop();
                stack.push(first - second);
            } else if (token.equals("*")) {
                var second = stack.pop();
                var first = stack.pop();
                stack.push(first * second);
            } else if (token.equals("/")) {
                var second = stack.pop();
                var first = stack.pop();
                stack.push(first / second);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
