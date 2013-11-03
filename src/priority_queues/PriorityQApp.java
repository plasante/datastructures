package priority_queues;

/*
 * Whe should always check isFull() before using insert().
 * 
 * front is always an nItems - 1 and rear is always at 0
 * 
 * Deletion runs in O(1) time.
 * 
 * Insertion runs in O(N) time and can be improve whith heaps.
 */
public class PriorityQApp {

	public static void main(String[] args) {
		PriorityQ thePQ = new PriorityQ(5);
		thePQ.insert(30);
		thePQ.insert(50);
		thePQ.insert(10);
		thePQ.insert(40);
		thePQ.insert(20);
		
		while( !thePQ.isEmpty() ) {
			long item = thePQ.remove();
			System.out.print(item + " ");	// 10, 20, 30, 40, 50
		}
		System.out.println("");
	}

}
