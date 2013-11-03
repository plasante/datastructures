package stacks;

public class StackX {
	private int maxSize;		// size of stack array
	private long[] stackArray;
	private int top;
	
	public StackX(int s) {
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;							// no items yet
	}
	
	public void push(long j) {
		stackArray[++top] = j;				// increment top and insert item in the stack
	}
	
	public long pop() {
		return stackArray[top--];			// access item and decrement top
	}
	
	public long peek() {
		return stackArray[top];				// peek at top of stack
	}
	
	public boolean isEmpty() {
		return (top == -1);					// true if stack is empty
	}
	
	public boolean isFull() {
		return (top == maxSize - 1);		// true if stack is full
	}
}
