package linked_lists;

import java.io.*;

public class InterIterApp {
	public static void main(String[] args) {
		LinkList9 theList = new LinkList9();
		ListIterator iter1 = theList.getIterator();
		long value;
		
		iter1.insertAfter(20);
		iter1.insertAfter(40);
		iter1.insertAfter(60);
		iter1.insertAfter(80);
		
		while( true ) {
			System.out.print("Enter first letter of show, reset, ");
			System.out.print("next, get, before, after, delete: ");
			System.out.flush();
			
			int choice = getChar();
			
			switch(choice) {
				case 's':
				case 'r':
				case 'n':
				case 'g':
				case 'b':
				case 'a':
				case 'd':
					break;
				default:
					System.out.println("Invalid entry");
			}
		}
	} // end main
	
	public static String getString() {
		return "";
	}
	
	public static char getChar() {
		return 'a';
	}
	
	public static int getInt() {
		return 0;
	}
}

class Link9 {
	public long dData;
	public Link9 next;
	
	
	public Link9(long dd) {
		dData = dd;
	}
	
	public void displayLink() {
		System.out.print(dData + " ");
	}
}

class LinkList9 {
	private Link9 first;
	
	public LinkList9() {
		first = null;
	}
	
	public Link9 getFirst() {
		return first;
	}
	
	public void setFirst(Link9 f) {
		first = f;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public ListIterator getIterator() {
		return new ListIterator(this);
	}
	
	public void displayList() {
		Link9 current = first;
		while( current != null ) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}

class ListIterator {
	private Link9 current;
	private Link9 previous;
	private LinkList9 ourList;
	
	public ListIterator( LinkList9 list ) {
		ourList = list;
		reset();
	}
	
	public void reset() {
		current = ourList.getFirst();
		previous = null;
	}
	
	public boolean atEnd() {
		return (current.next==null);
	}
	
	public void nextLink() {
		previous = current;
		current = current.next;
	}
	
	public Link9 getCurrent() {
		return current;
	}
	
	public void insertAfter(long dd) {
		Link9 newLink = new Link9(dd);
		
		if( ourList.isEmpty() ) {
			ourList.setFirst(newLink);
			current = newLink;
		} else {
			newLink.next = current.next;
			current.next = newLink;
			nextLink();
		}
	}
	
	public void insertBefore(long dd) {
		Link9 newLink = new Link9(dd);
		
		if( previous == null ) {
			newLink.next = ourList.getFirst();
			ourList.setFirst( newLink );
			reset();
		} else {
			newLink.next = previous.next;
			previous.next = newLink;
			current = newLink;
		}
	}
	
	public long deleteCurrent() {
		long value = current.dData;
		if( previous == null ) {
			ourList.setFirst(current.next);
			reset();
		} else {
			previous.next = current.next;
			if( atEnd() )
				reset();
			else
				current = current.next;
		}
		return value;
	}
}
