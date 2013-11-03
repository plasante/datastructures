package stacks;

import java.io.*;

public class BracketApp {

	public static void main(String[] args) throws IOException {
		String input;
		while(true) {
			System.out.print("Enter a string containing delimiters: ");
			System.out.flush();
			input = getString();
			if( input.equals("") ) {
				break;					// Quit the program if input == ""
			}
			BracketChecker theChecker = new BracketChecker(input);
			theChecker.check();
		}
	}

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}
