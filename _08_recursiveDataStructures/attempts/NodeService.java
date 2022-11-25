package practicePackage._08_recursiveDataStructures.attempts;

import practicePackage._08_recursiveDataStructures.Node;

public class NodeService {
	/**
	 * @param start
	 * @return sum of all items starting at Node start
	 * 
	 * FOR EXAMPLE,
	 * 
	 * if start.data = 20
	 * and start.next refers to another Node (say b) such that
	 * b.data = 50
	 * and b.next refers to another Node (say c) such that
	 * c.data = 10
	 * and c.next is null
	 * 
	 * we represent this as:
	 * 
	 * start represents [20, 50, 10]
	 * 
	 * in this case, the method should return 80
	 */
	public static int sum(Node start) {
		int value = 0;
		Node a = start;
		while(a !=null) {
			value +=a.data;
			a = a.next;
		}
		return value;
	}

	//DO NOT MODIFY
	public static String toString(Node start) {
		return "["+ toStringSecondary(start);
	}

	private static String toStringSecondary(Node start) {
		if(start == null) {
			return "]";
		}
		String sub = toStringSecondary(start.next);
		if(sub == "]") {
			return start.data + sub; //last item
		}
		else {
			return start.data + ", " + sub;
		}
	}

	/**
	 * 
	 * @param start
	 * @return sum of all odd numbers
	 */
	public static int sumOdd(Node start) {
		int value = 0;
		Node a = start;
		while(a !=null) {
			if(a.data%2 !=0) {
			value +=a.data;
			}
			a = a.next;
		}
		return value;
	}

	/**
	 * 
	 * @param start
	 * @return number of non-null Nodes starting at Node start.
	 * For example if 
	 * start represents [10, 70, 20, 90]
	 * return 4
	 */
	public static int count(Node start) {
		int count = 0;
		Node a = start;
		while(a !=null) {
			count++;			
			a = a.next;
		}
		return count;

	}

	/**
	 * 
	 * @param start
	 * @return number of positive numbers
	 */
	public static int countPositives(Node start) {
		int count = 0;
		Node a = start;
		while(a !=null) {
			if(a.data> 0) {
			count++;
			}
			a = a.next;

		}
		return count;
	}

	/**
	 * 
	 * @param start
	 * @return number of prime numbers
	 * 
	 * The method isPrime is provided in class
	 * MathService and can be called as:
	 * MathService.isPrime(number to check)
	 */
	public static int countPrimes(Node start) {
		int count = 0;
		Node a = start;
		while(a !=null) {
			if(MathService.isPrime(a.data)) {
				count++;
			}
			a = a.next;
		}
		return count;

	}

	/**
	 * 
	 * @param start
	 * @return the first Node starting at Node start
	 * containing a positive data value
	 * return null if no Node containing a positive data value
	 * 
	 * for example, if
	 * start represents [-5, 0, 6, 2, -8, 0]
	 * 
	 * and the Node returned is result, then
	 * result represents [6, 2, -8, 0]
	 */
	public static Node getFirstPositiveNode(Node start) {
		Node a = start;
		while(a!= null) {
			if(a.data >0) {
				return a;
			}
			a = a.next;
		}
		return null;
	}

	/**
	 * 
	 * @param start1
	 * @param start2
	 * @return true if sequence of items starting
	 * at Nodes start1 and start2
	 * have the same items in the same order
	 * 
	 * return false if either list is null
	 * 
	 * FOR EXAMPLE,
	 * 
	 * if 
	 * start1 represents [10, 70, 20, 90]
	 * start2 represents [10, 70, 20, 90]
	 * return true
	 *
	 * if 
	 * start1 represents [10, 70, 20, 90]
	 * start2 represents [90, 10, 20, 70]
	 * return false
	 *
	 * if 
	 * start1 represents [10, 60, 20, 90]
	 * start2 represents [90, 10, 20, 70]
	 * return false
	 * 
	 * if 
	 * start1 represents [10, 20, 90]
	 * start2 represents [90, 10, 20, 70]
	 * return false
	 * if 
	 * start1 represents [10, 20, 90]
	 * start2 represents [10, 20]
	 * return false
	 */
	public static boolean identical(Node start1, Node start2) {
		Node a = start1;
		Node b = start2;
		int counterA = 0;
		int counterB = 0;
		while(a!= null) { //length of a chain
			counterA++;
			a=a.next;
			
		}
		while(b !=null) { // length of b chain
			counterB++;
			b=b.next;
		}
		if(counterA != counterB) {// different lengths
			return false;
		} 
		while(a!= null) { //length of a chain
			if(a.data != b.data) {
				return false;
			}
			a=a.next;
			b=b.next;
		}
		return true; //to be completed
	}
	
	/**
	 * 
	 * @param start
	 * @param idx
	 * @return a reference to the node at index idx (if any) in the sequence
	 * of nodes starting at start. return null if an item doesn't exist at that index.
	 * Note: first item (start) is considered to be at index 0
	 */
	public static Node getItemAt(Node start, int idx) {
		if(idx < 0) {
			return null;
		}
		int index = 0;
		Node a = start;
		while(a!= null) {
			if(index == idx) {
				return a;
			}
			index++;
			a=a.next;
		}
		return null;
	}

	/**
	 * 
	 * @param start
	 * @return a reference to the node that ends the sequence
	 * of nodes starting at start. return null if start is null
	 */
	public static Node getTail(Node start) {
		if(start == null) {
			return null;
		}
		Node a = start;
		while (a.next !=null) {
			a = a.next;
		}
		return a;
	}

	/**
	 * 
	 * @param start
	 * @param val
	 * do nothing (and return false) if start is null.
	 * otherwise, add a node containing val at the end of the sequence
	 * of nodes starting at start, and return true.
	 */
	public static boolean append(Node start, int val) {
		if(start == null) {
			return false;
		}
		Node a = start;
		getTail(a).next = new Node(val, null);
		return true;
	}
	
	/**
	 * start.data is considered to be item at index 0
	 * start.next.data is considered to be item at index 1
	 * start.next.next.data is considered to be item at index 2
	 * and so on...
	 * 
	 * @param start
	 * @param idx1
	 * @param idx2
	 * @return Node that starts a sequence of items 
	 * from index idx1 to index idx2 
	 * (inclusive on both sides) in items beginning 
	 * at Node start, if valid.
	 * return null if the range is invalid.
	 * FOR EXAMPLE:
	 * If 
	 * start represents [10, 70, 20, 50, 90, 30, 80]
	 * idx1 = 2
	 * idx2 = 5
	 * 
	 * then for the returned object,
	 * start represents [20, 50, 90, 30]
	 */
	public static Node subList(Node start, int idx1, int idx2) {
		int count = 0;
		Node a = start;

		
		return null; //to be completed
	}

	/**
	 * 
	 * @param start1
	 * @param start2
	 * @return true if items starting at Nodes
	 * start1 and start2 are the same  
	 * (ok to be in different order)
	 * 
	 * FOR EXAMPLE,
	 *
	 * if 
	 * start1 represents [10, 70, 20, 90]
	 * start2 represents [90, 10, 20, 70]
	 * return true
	 *
	 * if 
	 * start1 represents [10, 60, 20, 90]
	 * start2 represents [90, 10, 20, 70]
	 * return false
	 * 
	 * if 
	 * start1 represents [10, 20, 90]
	 * start2 represents [90, 10, 20, 70]
	 * return false
	 * 
	 * if 
	 * start1 represents [10, 20, 90]
	 * start2 represents [10, 20]
	 * return false
	 */
	public static boolean same(Node start1, Node start2) {
		if(identical(start1, start2)) {
			return true;
		}
		Node a = start1;
		Node b = start2;
		
		return false; //to be completed
	}

	/**
	 * @param start: assume the sequence of nodes starting at Node start are in ascending order
	 * @param value
	 * @return reference to the first Node at which the sorted sequence starts
	 * add a node containing value in the sequence of nodes starting at Node start such that
	 * the sequence of nodes starting at Node start are STILL in ascending order 
	 */
	public static Node addAscending(Node start, int value) {
		Node a = start;
		Node temp = new Node(value, null);
		while (a.next != null) {
			if(value < a.next.data) {
				temp.next = a.next;
				a.next = temp;
				a = a.next;
			}
			a = a.next;
		}
		return start;
	}

	/**
	 * sort the nodes starting at Node start
	 * in ascending order if asc = true,
	 * otherwise sort in descending order
	 * @param start
	 * @param asc
	 * @return reference to the first Node at which the sorted sequence starts
	 */
	public static Node sort(Node start, boolean asc) {
		Node s = start;
		Node temp = new Node(0, null);
		return null; //to be completed
	}
	

	/**
	 * 
	 * @param start1
	 * @param start2
	 * @return Node object starting a sequence of
	 * items from start1 followed by all items
	 * of start2
	 * FOR EXAMPLE:
	 * if 
	 * start1 represents [10, 70, 20]
	 * start2 represents [50, 90]
	 * 
	 * then if the returned object is result, 
	 * result represents [10, 70, 20, 50, 90]
	 * 
	 * IMPORTANT: if the actual parameter for start1 or start2 is modified afterwards
	 * in the client (after calling the method), the returned list should not be modified.
	 * That is, create proper instance copies with no reference sharing.
	 */
	public static Node join(Node start1, Node start2) {
		Node a = start1;
		Node b = start2;
		if(a == null) {
			return b;
		}
		if(b == null) {
			return a;
		}
		Node temp = getTail(a);
		temp.next = b;
		return a; //to be completed
	}
}
