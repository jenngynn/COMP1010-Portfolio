package practicePackage._06_sorting.attempts;

public class Stage2 {
	/**
	 * @param data - assume data is sorted in ascending order up to idx
	 * @param idx
	 * @return the array after the value at index idx is shifted to the correct
	 *         sorted position.
	 */
	public static int[] shiftToRightPlace(int[] data, int idx) {
		if(data == null) {
			return data; 
		}
		for(int i = 0; i < idx; i++) {
			if(data[i] > data[idx]) {
				int temp = data[i];
				data[i] = data[idx];
				data[idx] = temp;
			}
		}
		return data;

	}

	/**
	 * @param data - assume data is sorted up to idx and all numbers in the sorted
	 *             part is smaller than in the unsorted part.
	 * @param idx
	 * @return the array after the next swap has occurred. For example [20, 70, 40,
	 *         90, 30, 80, 20] would swap 70 and 20.
	 */
	public static int[] swapToRightPlace(int[] data, int idx) {
		if(data == null) {
			return null;
		}
		int minIndex = idx; // make the element at idx the smallest
		for(int i=idx+1;i<data.length;i++) {
			if(data[i] < data[minIndex]) {
				minIndex = i; // update smallest
			}
		}
		Stage1.swap(data, idx, minIndex);
		return data;
	}

	/**
	 * Given a sorted array with an even length, pair up all the values so that the
	 * max number in the pairs is minimal. If data is invalid, return null.
	 */
	public static int[] pair(int[] data) {
		if(data == null) {
			return null;
		}
		int [] paired = new int[data.length/2];
		for(int i = 0;i < paired.length;i++) {
			paired[i] = data[i] + data[(data.length-1) - i];
		}
		return paired; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the most common number in the sorted array. If there is a tie, select
	 *         the number that occurs first. If data is invalid or empty, return -1.
	 */
	public static int mostCommon(int[] data) {
		if(data == null || data.length ==0) {
			return -1;
		}
		int first = data[0]; //holds first occurrence
		int count = 0; //numbe of occurrences
		int prevCount = 0;
		for(int i = 1;i<data.length;i++) {
			int k = i-1;
			if(data[i] == data[k]) {
				count++;
			} else {
			count = 1; // unique
			}
			if(count > prevCount) {
				prevCount = count;
				first = data[k];
			}
		}
		return first;
	}

	/**
	 * 
	 * @param data
	 * @return true if data is sorted in either ascending or descending order, false
	 *         otherwise.
	 */
	public static boolean isSorted(int[] data) {
		if(data == null || data.length == 0) {
			return false;
		}
		if(data.length == 1) {
			return true;
		}
		int asc = 1;
		int dec = 1;
		for(int i = 0;i<data.length-1;i++) {
			if(data[i] <= data[i+1]) { //sorted in Ascending
				asc++;
			}
			if(data[i] >=data[i+1]) { // sorted decending
				dec++;
			}
		}
		if(asc == data.length || dec == data.length) {// whole array is sorted
			return true; 
		}
		return false;

	}

	/**
	 * @param data
	 * @param val
	 * @return the array after val is inserted at the correct position. Assume data
	 *         is sorted is ascending order. If the array is invalid, return null.
	 */
	public static int[] insertAtRightPlace(int[] data, int val) {
		if (data == null || data.length == 0) {
			return null;
		}
		int withVal[] = new int[data.length + 1];
		for(int i = 0; i < data.length; i++) { //populate array with items from data
			withVal[i] = data[i];
		}
		withVal[withVal.length -1] = val; //append val onto the array
		//selection sort
		for(int i = 0; i < withVal.length-1; i++) {
			int minIndex = i; 
			for(int k = i +1; k < withVal.length; k++) {
				if (withVal[k] < withVal[minIndex]) {
					minIndex = k; 
				}
			}
			int temp = withVal[i]; 
			withVal[i] = withVal[minIndex]; 
			withVal[minIndex] = temp; 
		}
		return withVal;
	}

	/**
	 * 
	 * @param data
	 * @return the sorted array. Use one of the algorithms learned in class to sort
	 *         the data.
	 */
	public static int[] sort(int[] data) {
		//selection sort
		for(int i = 0; i < data.length-1; i++) {
			int minIndex = i; 
			for(int k = i +1; k < data.length; k++) {
				if (data[k] < data[minIndex]) { 
					minIndex = k; 
				}
			}
			int temp = data[i]; 
			data[i] = data[minIndex];
			data[minIndex] = temp; 
		}
		return data;
	}

	/**
	 * ADVANCED: there exists an O(nlogn) solution using merge sort (which will be
	 * covered in 2010)
	 * 
	 * @param data
	 * @return the number of swaps needed to sort the array using bubble sort.
	 *         Return -1 if data is invalid.
	 */
	public static int bubbleSortCount(int[] data) {
		if(data == null) {
            return -1;
        }
        int nSwaps = 0;
        for(int i = 0; i < data.length; i++) {
            int num = data[i];
            int k = i-1;
            while(k >= 0 && data[k] >= num) {
                nSwaps++;
                data[k + 1] = data[k];
                k = k - 1;
            }
            data[k + 1] = num;
        }
        return nSwaps;
	}

	/**
	 * 
	 * @param data
	 * @return the number of items you need to shift to sort the array using
	 *         insertion sort. Return -1 if data is invalid.
	 */
	public static int insertionSortCount(int[] data) {
		if(data == null) {
            return -1;
        }
        int count = 0;
        for(int i = 0; i < data.length; i++) {
            int num = data[i];
            int k = i-1;
            while(k >= 0 && data[k] >= num) {
                count++;
                data[k + 1] = data[k];
                k = k - 1;
            }
            data[k + 1] = num;
        }
        return count;
	}

	
}
