import java.util.Stack;

public class Calculator {
    private Stack<Expression> stack = new Stack<>();

    public Calculator(String expression) {
        Expression exp1, exp2;

        String[] elements = expression.split(" ");
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].charAt(0) == '+') {
                exp1 = stack.pop();
                exp2 = new Number(Integer.valueOf(elements[++i]));
                stack.push(new Addition(exp1, exp2));
            } else {
                stack.push(new Number(Integer.valueOf(elements[i])));
            }
        }
    }

    public int calculate() {
        return stack.pop().interpret();
    }
}