import java.util.Stack;

public class NewCalculator {

	public static void main(String[] args) {

		// make sure we have an expression on the command line
		if (args.length != 1) {
			System.err.println("Usage: NewCalculator <expression>");
			return;
		}
		String expression = args[0];

		int result = calculate(expression);
		System.out.println("result: " + result);
	}

	private static int calculate(String expression) {
		// split expression up into tokens
		String[] tokens = expression.split(" ");

		// for each token in the expression ...
		Stack<Integer> stack = new Stack<Integer>();
		for (String token : tokens) {
			if (!handleNumber(stack, token) &&
					!handleOperator(stack, token)) {
						throw new IllegalArgumentException ("garbage");			
				}
		}

		// the result is the last thing left on the stack
		return stack.pop();
	}

	private static boolean handleNumber(Stack<Integer> stack, String token) {
		try {
			// if the token is an integer, push it
			int number = Integer.parseInt(token);
			stack.push(number);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	private static boolean handleOperator(Stack<Integer> stack, String token) {
		// if the token is an operator, pop two numbers,
		// perform the op and push the result
		if (token.equals("+")) {
			int rhs = stack.pop(), lhs = stack.pop();
			stack.push(lhs + rhs);
		} else if (token.equals("-")) {
			int rhs = stack.pop(), lhs = stack.pop();
			stack.push(lhs - rhs);
		} else if (token.equals("*")) {
			int rhs = stack.pop(), lhs = stack.pop();
			stack.push(lhs * rhs);
		} else if (token.equals("/")) {
			int rhs = stack.pop(), lhs = stack.pop();
			stack.push(lhs / rhs);
		} else {
			return false;
			//throw new IllegalArgumentException("garbage in expression");
		}
		return true;
	}

}