package practicePackage._07_arrayBasedList.attempts;

public class Queue {
	public int size;
	public String[] items;
	
	/**
	 * initialize array to an empty array and size to 0
	 */
	public Queue() {
		items = new String[0];
		size = 0;
	}
	
	/**
	 * 
	 * @return if there are no items currently on the queue
	 * (note that the array may be of size 5 or 10 or ... and still be empty)
	 */
	public boolean isEmpty() {
		return size == 0; 
	}
	
	/**
	 * 
	 * @return if no more items can be added to the queue.
	 * That is, the queue is at capacity
	 */
	public boolean isFull() {
		return size == items.length;
	}
	
	/**
	 * increase the capacity of the queue by 5
	 */
	public void grow() {
		String[] longerArr = new String[items.length +5];
		for(int i = 0;i<items.length;i++) {
			longerArr[i] = items[i];
		}
		items = longerArr;
		return;
	}
	
	/**
	 * add an item on "top" of the queue.
	 * For example, if the array is of length 10 and there are 7 items on the queue,
	 * the item passed is added as the 8th item, and now the queue size is 8.
	 * Note that nothing should be done if the passed String is null.
	 * @param s
	 */
	public void insert(String s) {
		if(s == null) {
			return;
		}
		if(isFull()) {
			grow();
			items[size] = s;
			size++;
		} else {
			items[size] = s;
			size++;
		}
		return;
	}
	
	/**
	 * 
	 * @return the front item (and remove it) from the queue.
	 * return null if queue is empty.
	 */
	public String remove() {
		if(isEmpty()) {
			return null;
		}
		String toRemove = items[0];
		
		for(int i = 0;i<size-1;i++) { //shift all values up
			int k = i+1;
			items[i] = items[k];
		}
		items[size-1] = null;
		size--;
		return toRemove;
	}
	
	/**
	 * 
	 * @return the top item without removing it from the queue.
	 * return null if queue is empty.
	 */
	public String front() {
		if(isEmpty()) { // size == 0
			return null;
		}
		return items[size-1];
	}
	
	/**
	 * @param idx: index of item to be removed
	 * @return the item at index idx from the queue. Assume that the index of the "bottom"
	 * item is 0, and the top item is size-1.
	 * return null if there is no item at passed index.
	 */
	public String get(int idx) {
		if(idx < 0 || idx >= size) {
			return null;
		}
		return items[idx];
	}
	
	/**
	 * return a string representation of the queue.
	 * if the queue has items "Me" (at index 2), "fail" (at index 1), 
	 * "English" (at index 0), 
	 * the String returned should be "Me\nFail\nEnglish".
	 * Return "" if the queue is empty.
	 */
	public String toString() {
		if(size == 0) {
			return  "";
		}
		String result = "";
		for(int i=size-1;i>=0; i--) {
			result += items[i] +"\n";
		}
		return result;
	}
}
