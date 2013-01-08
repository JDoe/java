import java.util.Stack;

public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * get an expression from the command line args
		 * split expression up into tokens
		 *  for each token:
		 * if we see a number:
		 * - push it on the stack
		 * if we see an operator:
		 * - pop two numbers
		 * - perform the op
		 * - push the result
		 * the result is the last thing left on the stack
		 **/

		// make sure we have an expression on the command line
		if (args.length != 1) {
			System.err.println("Usage: Calculator <expression>");
			return;
		}

		// get an expression from the CLI args
		String expression = args[0];
		System.out.println("Expression is "+ expression);

		// split expression into token
		String[] tokens = expression.split(" ");
		System.out.println("tokens.size: " + tokens.length);

		Stack<Integer> stack = new Stack<Integer>();
		// for each token in the expression,
		// push to stack if it is a number
		// can be combined into for (string token: expression.split( " ")
		for (String token: tokens){
			//check if number is token or not
			System.out.println(token);
			try {
				int x = Integer.parseInt(token);
				System.out.println("Found number "+ x);
				stack.push(x);
			// catch block: if token is operator
			} catch (NumberFormatException e) {
				// if operator is seen pop two numbers...
				int rhs = stack.pop(), lhs = stack.pop();
				System.out.println(token + " is not a number ");
				//String OperatorType = token; // does not work in JRE1.6
				/*switch (token) {
				 * case "+":
				 * case "-":
				 * case "*":
				 * case "/":
				 * 	System.out.println(token + " is an operator");
				 * 	break;
				 * default:
				 * 	System.out.println(token + " is garbage");
				}*/

				// ...and perform corresponding operation
				if (token.equals("+")) {
					stack.push(lhs +rhs);
					System.out.println(token + " is addition");
				} else if (token.equals("-")) {
					stack.push(lhs +rhs);
					System.out.println(token + " is subtraction");
				} else if (token.equals("*")) {
					stack.push(lhs +rhs);
					System.out.println(token + " is multiplication");
				} else if (token.equals("/")) {
					stack.push(lhs +rhs);
					System.out.println(token + " is division");
				} else {
					throw new IllegalArgumentException("garbage in expression");
					//System.out.println(token + " is garbage");
				}
			}
		} //end for loop
		// push the result
		int result = stack.pop();
		System.out.println("Result: " + result);

	}

}
