package stacks;

public class StackY {
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public StackY(int s) {
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	public void push(char j) {
		stackArray[++top] = j;				// increment top and insert item in the stack
	}
	
	public char pop() {
		return stackArray[top--];			// access item and decrement top
	}
	
	public char peek() {
		return stackArray[top];				// peek at top of stack
	}
	
	public boolean isEmpty() {
		return (top == -1);					// true if stack is empty
	}
}
