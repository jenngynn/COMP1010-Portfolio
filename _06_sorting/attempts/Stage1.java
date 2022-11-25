package practicePackage._06_sorting.attempts;

public class Stage1 {
	/**
	 * @param data
	 * @param idx1
	 * @param idx2
	 * @return the array after the items at idx1 and idx2 are swapped. If either
	 *         indices are invalid, return null.
	 */
	public static int[] swap(int[] data, int idx1, int idx2) {
		if(idx1 >= data.length || idx2 >= data.length || data == null || idx1 < 0 || idx2 < 0){
			return null;
		}
		int item1 = data[idx1]; //hold the value at idx1
		data[idx1] = data[idx2]; // put value idx2 into idx1
		data[idx2] = item1; // put value of idx1 into idx2
		return data;
	}

	/**
	 * 
	 * @param data
	 * @return the first index of where data isn't sorted in ascending order. If
	 *         data is sorted, return the length of the array. For example {10, 20,
	 *         90, 5, 70} would return 3 (90 > 5). If data is invalid, return -1;
	 */
	public static int partSorted(int[] data) {
		if(data == null) {
			return -1;
		}
		for(int i = 0;i<data.length-1;i++) {// find the first index
			if(data[i+1] <data[i] ) {
				return i+1;
			}
			
		}
		return data.length;
	}

	/**
	 * 
	 * @param data
	 * @return true if the sorted array contains any duplicates, false otherwise.
	 */
	public static boolean duplicates(int[] data) {
		if(data == null) {
			return false;
		}
		for(int i = 0;i<data.length;i++) { 
			for(int k = i+1;k<data.length;k++) {
				if(data[i] == data[k]) {
					return true;
				}
			}
		}
		return false;
	}
}
