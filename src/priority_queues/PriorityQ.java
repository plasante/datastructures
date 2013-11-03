package priority_queues;

// array in sorted order, from max at 0 to min at size - 1
public class PriorityQ {
	private int maxSize;
	private long[] queArray;
	private int nItems;
	
	public PriorityQ(int s) {
		maxSize = s;
		queArray = new long[maxSize];
		nItems = 0;
	}
	
	public void insert(long item) {
		int j;
		
		if( nItems == 0 ) {
			queArray[nItems++] = item;				// insert at 0
		} else {
			for( j = nItems - 1; j >= 0; j-- ) {	// start at end
				if( item > queArray[j] ) {			// if new item larger
					queArray[j+1] = queArray[j];	// shift upward
				} else {
					break;							// done shifting
				}
			}
			queArray[j+1] = item;
			nItems++;
		}
	}
	
	public long remove() {
		return queArray[--nItems];					// remove minimum item
	}
	
	public long peekMin() {							// peek at minimum item
		return queArray[nItems - 1];
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
}
