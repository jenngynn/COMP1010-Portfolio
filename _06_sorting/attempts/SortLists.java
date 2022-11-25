package practicePackage._06_sorting.attempts;

import java.util.ArrayList;

public class SortLists {

	public static ArrayList<Integer> insert(ArrayList<Integer> list, int value) {
		if(list == null) {
			return null;
		}
		list.add(value); //append value onto the arraylist
		//selection sort
		for(int i = 0; i < list.size()-1; i++) {
			int minIndex = i; 
			for(int k = i +1; k < list.size(); k++) {
				if (list.get(k) < list.get(minIndex)) {
					minIndex = k; 
				}
			}
			int temp = list.get(i); 
			list.set(i, list.get(minIndex));
			list.set(minIndex, temp);
		}
		
		return list;
	}

	public static ArrayList<Integer> insertUnique(ArrayList<Integer> list, int value) {
		if(list == null) {
			return null;
		}
		if(list.size() == 0) {
			list.add(value);
		}
		for(int u = 0;u<list.size();u++){
			if(value == list.get(u)) {
				return list;
			}
			list.add(value);
			for(int i = 0; i < list.size()-1; i++) {
			int minIndex = i; 
			for(int k = i +1; k < list.size(); k++) {
				if (list.get(k) < list.get(minIndex)) {
					minIndex = k; 
				}
			}
			int temp = list.get(i); 
			list.set(i, list.get(minIndex));
			list.set(minIndex, temp);
		}
		for(int i = 1;i<list.size()-1;i++) {
			if(list.get(i) == list.get(i-1)) {
				list.remove(i);
			}
		}}
		
		return list;
	}

	/**
	 * 
	 * @param data - 2D array where every subarray contains a pair of numbers.
	 *             Assume there are no duplicates in the array.
	 * @param n    - The input array only contains the numbers 0 - (n-1).
	 * @return A list of size n. Every sublist should contain the sorted numbers
	 *         that is paired with the index. For example if the pairs were (1, 3),
	 *         (2,1), (2,0), the returned list would be [[2], [2, 3], [0, 1], [1]]
	 * 
	 */
	public static ArrayList<ArrayList<Integer>> sortInput(int[][] data, int n) {
		if(data == null) {
			return null;
		}
		return null; //to be completed
	}
}
