package stacks;

/**
 * The user should always check to be sure the stack is not full before inserting an item.
 * 
 * But many stack classes check for these errors internally, in the push() and pop()
 * methods and throw an exception to be caught by the class user.
 * 
 * @author plasante
 *
 */
public class StackApp {

	public static void main(String[] args) {
		StackX theStack = new StackX(10);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		
		while( !theStack.isEmpty() ) {
			long value = theStack.pop();
			System.out.print(value);
			System.out.print(" ");
		}
		
		System.out.println("");
	}

}
