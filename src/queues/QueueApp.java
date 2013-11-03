package queues;

/*
 * The insert() method assumes that the queue is not full.
 * 
 * We should normally call insert() only after calling isFull()
 * 
 * We should normally call remove() only after calling isEmpty()
 * 
 * We could easily implement peekFront() and peekRear()
 * 
 * The queue can appear to be full and empty at the same time.
 * 
 * This problem can be solved by making the array one cell larger than the maximum number of
 * items that will be placed in it.
 * 
 */
public class QueueApp {

	public static void main(String[] args) {
		Queue theQueue = new Queue(5);
		
		theQueue.insert(10);		// insert 4 items
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);
		
		theQueue.remove();			// remove 3 items (10, 20, 30)
		theQueue.remove();
		theQueue.remove();
		
		theQueue.insert(50);		// insert 4 more items (wraps around)
		theQueue.insert(60);
		theQueue.insert(70);
		theQueue.insert(80);
		
		while( !theQueue.isEmpty() ) {
			long n = theQueue.remove();
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.println("");
	}

}
