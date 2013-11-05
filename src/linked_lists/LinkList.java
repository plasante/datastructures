package linked_lists;

public class LinkList {
	private Link first;			// ref to the first link on list
	
	public LinkList() {
		first = null;			// no items on list yet
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	/*
	 * Insert at start of list
	 */
	public void insertFirst(int id, double dd) {
		Link newLink = new Link(id, dd);
		newLink.next = first;
		first = newLink;
	}
	
	/*
	 * Delete first item
	 */
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayList() {
		System.out.print("List (first-->last): ");
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}