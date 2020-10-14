import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void isEmptyTest() {
		Stack stack = new Stack();
		Boolean actual = stack.isEmpty();
		assertTrue(actual);
	}
	@Test
	public void pushIsEmptyTest() {
		Stack stack = new Stack();
		String expected = "Hello, World!";
		stack.push(expected);
		Boolean actual = stack.isEmpty();
		assertFalse(actual);
	}
	@Test
	public void pushPopCheckResultsTest() {
		Stack stack = new Stack();
		String expected = "Hello, World!";
		stack.push(expected);
		String actual = stack.pop();
		assertEquals(expected, actual);
	}
}
