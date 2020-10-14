import java.util.ArrayList;

public class Stack {
ArrayList<String> stack = new ArrayList<String>();
	public Boolean isEmpty() {
		// TODO Auto-generated method stuB
		return stack.isEmpty();
	}
	public void push(String expected) {
		// TODO Auto-generated method stub
		stack.add(expected);
	}
	public String pop() {
		// TODO Auto-generated method stub
		return stack.remove(0);
	}
	public String peek() {
		// TODO Auto-generated method stub
		return stack.get(0);
	}
}
