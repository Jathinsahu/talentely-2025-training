
import java.util.*;

class InfixToPostfix {
    public static String convert(String exp) {
        StringBuilder res = new StringBuilder();
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                res.append(c);
            } else if (c == '(') {
                stk.push(c);
            } else if (c == ')') {
                while (!stk.isEmpty() && stk.peek() != '(') {
                    res.append(stk.pop());
                }
                if (!stk.isEmpty()) stk.pop();
            } else {
                while (!stk.isEmpty() && stk.peek() != '(') {
                    char top = stk.peek();
                    if (prec(top) > prec(c) || (prec(top) == prec(c) && !right(c))) {
                        res.append(stk.pop());
                    } else break;
                }
                stk.push(c);
            }
        }

        while (!stk.isEmpty()) {
            res.append(stk.pop());
        }

        return res.toString();
    }

    private static int prec(char op) {
        if (op == '^') return 3;
        if (op == '*' || op == '/') return 2;
        if (op == '+' || op == '-') return 1;
        return 0;
    }

    private static boolean right(char op) {
        return op == '^';
    }
}
