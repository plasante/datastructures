package binary_trees;

import java.io.*;

public class TreeApp {

	public static void main(String[] args) throws IOException {
		int value;
		Tree theTree = new Tree();
		
		theTree.insert(50, 1.5);
		theTree.insert(25, 1.5);
		theTree.insert(75, 1.2);
		theTree.insert(12, 1.7);
		theTree.insert(37, 1.5);
		theTree.insert(43, 1.2);
		theTree.insert(30, 1.7);
		theTree.insert(33, 1.5);
		theTree.insert(87, 1.5);
		theTree.insert(93, 1.5);
		theTree.insert(97, 1.5);
		
		theTree.displayTree();
		
		while(true) {
			System.out.print("Enter first letter of show, ");
			System.out.print("insert, find, delete, show , or traverse: ");
			int choice = getChar();
			
			switch(choice) {
				case 'i':
					System.out.print("Enter value to insert: ");
					value = getInt();
					theTree.insert(value, value + 0.9);
					break;
				case 'q':
				default: 
					System.out.println("Invalid entry");
			}
		}
	}

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		if( s.equals("") ) {
			return "quit";
		} else {
			return s;
		}
	}
	
	public static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}
	
	public static int getInt() throws IOException {
		String s = getString();
		if( s.equals("quit") ) {
			return 0;
		}
		return Integer.parseInt(s);
	}
}

class Node {
	public int iData;
	public double dData;
	public Node leftChild;
	public Node rightChild;
	
	public void displayNode() {
		System.out.print("{");
		System.out.print(iData);
		System.out.print(", ");
		System.out.print(dData);
		System.out.print("} ");
	}
}

class Tree {
	private Node root;				// first node of the tree
	
	public Tree() {					// constructor
		root = null;				// no nodes in tree yet
	}
	
	public Node find(int key) {		// find node with given key and assumes non-empty tree
		return null;
	}
	
	public void insert(int id, double dd) {
		Node newNode = new Node();				// make new node
		newNode.iData = id;						// initialise node
		newNode.dData = dd;
		
		if( root == null )						// no node in root
			root = newNode;
		else {									// root occupied
			Node current = root;				// start at root
			Node parent;
			while(true) {
				parent = current;
				if( id < current.iData ) {				// go left?
					current = current.leftChild;
					if( current == null ) {				// if end of the line
						parent.leftChild = newNode; 	// insert on left
						return;
					}
				} else {								// or go right?
					current = current.rightChild;
					if( current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
			
	}
	
	public boolean delete(int key) {			// delete node with given key (assumes non-empty list)
		return true;
	}
	
	private Node getSuccessor(Node delNode) {
		return null;
	}
	
	public void traverse(int traverseType) {
		
	}
	
	private void preOrder(Node localRoot) {
		
	}
	
	private void inOrder(Node localRoot) {
		
	}
	
	private void postOrder(Node localRoot) {
		
	}
	
	public void displayTree() {
		Stack globalStack = new Stack();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println("......................................................");
		while( isRowEmpty == false ) {
			Stack localStack = new Stack();
			isRowEmpty = true;
			for(int j = 0; j < nBlanks; j++)
				System.out.print(' ');
			
			while(globalStack.isEmpty() == false) {
				Node temp = (Node)globalStack.pop();
				if(temp != null) {
					System.out.print(temp.iData);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);
					if(temp.leftChild != null || temp.rightChild != null)
						isRowEmpty = false;
				} else {
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				for(int j = 0; j < nBlanks*2 - 2; j++)
					System.out.print(' ');
			}
			System.out.println("");
			nBlanks /= 2;
			while(localStack.isEmpty() == false) {
				globalStack.push( localStack.pop() );
			}
		}
		System.out.println("......................................................");
	}
}

class Stack {
	private final int SIZE = 100;
	private Node[] st;
	private int top;
	
	public Stack() {
		st = new Node[SIZE];
		top = -1;
	}
	
	public void push(Node j) {
		st[++top] = j;
	}
	
	public Node pop() {
		return st[top--];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
}
