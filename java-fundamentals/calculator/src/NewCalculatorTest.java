import static org.junit.Assert.*;
import java.util.Stack;


import org.junit.Test;


public class NewCalculatorTest {
	
	/*
	 * TODO:
	 * 	handleNumber:
	 * 	should handle number
	 * 	should not handle non-number: do nothing and return false
	 * 
	 * handleOperator
	 * 	should handle operator
	 * 	should not handle non-operator: do nothing and return false
	 * 
	 * calculate
	 * 	integration test: the result is calculated correctly
	 * if you pass garbage, it should throw exception
	 */
	@Test
	/*
	public void test() {
		//fail("Not yet implemented");
		//assertTrue(true);
		//assertTrue(1 == 1);
		assertEquals(2, 1+1);

	}*/
	
	public void handleNumberMustHandleNumbers() {
		Stack<Integer> stack = new Stack<Integer>();
		boolean result = NewCalculator.handleNumber(stack, "5");
		assertTrue(result);
		assertEquals(1, stack.size());
		assertEquals(5, (int) stack.peek());
	}
	
	@Test
	public void handleNumberMustNotHandleGarbage() {
		Stack<Integer> stack = new Stack<Integer>();
		boolean result = NewCalculator.handleNumber(stack, "");
		assertFalse(result);
		assertTrue(stack.isEmpty());
	}

	@Test
	public void handleOperatorMustHandleAddition() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(3);
		stack.push(5);
		boolean result = NewCalculator.handleOperator(stack, "+");
		assertTrue(result);
		assertEquals(1, stack.size());
		assertEquals(8, (int) stack.peek());
	}
	
	@Test
	public void handleOperatorMustNotHandleGarbage() {
		Stack<Integer> stack = new Stack<Integer>();
		boolean result = NewCalculator.handleOperator(stack, "");
		assertFalse(result);
		assertTrue(stack.isEmpty());
	}
	
	
	@Test
	public void onePlusOneMustEqualTwo() {
		assertEquals(2, NewCalculator.calculate("1 1 +"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void calculatorMustNotAcceptGarbage() {
		NewCalculator.calculate("garbage");
	}	
}
