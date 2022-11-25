package practicePackage._05_arrayList.attempts;

import java.util.ArrayList;

import serviceClasses.*;

public class Stage2 {
	/**
	 * 
	 * @param list
	 * @return the sum of all items of the list
	 * return 0 if list is null or empty
	 */
	public static int sum(ArrayList<Integer> list) {
		if(list == null || list.size() == 0) {
			return 0;
		}
		int sum = 0;
		for(Integer item : list) {
			sum +=item;
		}
		return sum;
	}

	/**
	 * 
	 * @param list
	 * @return the sum of all negatives items of the list
	 * return 0 if list is null or empty
	 */
	public static int sumNegatives(ArrayList<Integer> list) {
		int sum = 0;
		if(list == null || list.size() ==0) {
			return 0;
		}
		for(Integer item: list) {
			if(item < 0) {
				sum += item;
			}
		}
		return sum;
	}

	/**
	 * 
	 * @param list
	 * @return the number of even items in the list
	 * return 0 if list is null or empty
	 */
	public static int countEven(ArrayList<Integer> list) {
		int count = 0;
		if(list == null || list.size() ==0) {
			return 0;
		}
		for(Integer item: list) {
			if(item % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	/**
	 * 
	 * @param list
	 * @param target
	 * @return the number of times target exists in the list
	 * return 0 if list is null or empty
	 */
	public static int count(ArrayList<Integer> list, int target) {
		int count = 0;
		if(list == null || list.size() ==0) {
			return 0;
		}
		for(Integer item: list) {
			if(item == target) {
				count++;
			}
		}
		return count; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @param low
	 * @param high (assume low is less than or equal to high)
	 * @return the number of items in the list that belong to the range [low ... high]
	 * return 0 if list is null or empty
	 */
	public static int countInRange(ArrayList<Integer> list, int low, int high) {
		int count = 0;
		if(list == null || list.size() ==0) {
			return 0;
		}
		for(Integer item: list) {
			if(item >= low && item <=high) {
				count++;
			}
		}
		return count;
	}

	/**
	 * 
	 * @param list
	 * @param low
	 * @param high (assume low is less than or equal to high)
	 * @return true if there is at least one item in the list that is in the range [low ... high]
	 * return false if list is null or empty
	 */
	public static boolean containsInRange(ArrayList<Integer> list, int low, int high) {
		if(list == null || list.size() ==0) {
			return false;
		}
		for(Integer item: list) {
			if(item >= low && item <=high) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param list
	 * @param low
	 * @param high (assume low is less than or equal to high)
	 * @return true if all the items in the list are in the range [low ... high]
	 * return false if list is null
	 * return true if the list is empty
	 */
	public static boolean allInRange(ArrayList<Integer> list, int low, int high) {
		if(list == null || list.size() ==0) {
			return false;
		}
		for(Integer item: list) {
			if(item <low || item > high) {
				return false;
			}
		}
		return true; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return the number of prime numbers in the list
	 * return 0 if list is null or empty
	 * 
	 * IMPORTANT: you can (and should) use the helper 
	 * method isPrime(int) from class MathService as MathService.isPrime(value_to_check)
	 */
	public static int countPrimes(ArrayList<Integer> list) {
		int count = 0;
		if(list == null || list.size() ==0) {
			return 0;
		}
		for(Integer item: list) {
			if(MathService.isPrime(item)) {
				count++;
			}
		}
		return count;
	}

	/**
	 * 
	 * @param list
	 * @return true if there is at least one prime number in the list, false otherwise
	 * return false if list is null or empty
	 * 
	 * IMPORTANT: you can (and should) use the helper 
	 * method isPrime(int) from class MathService as MathService.isPrime(value_to_check)
	 */
	public static boolean containsPrime(ArrayList<Integer> list) {
		if(list == null || list.size() ==0) {
			return false;
		}
		for(Integer item: list) {
			if(MathService.isPrime(item)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param list
	 * @return true if all the items in the list are prime numbers, false otherwise
	 * return false if list is null
	 * return true if the list is empty (because technically, every item in the list IS prime)
	 * 
	 * IMPORTANT: you can (and should) use the helper 
	 * method isPrime(int) from class MathService as MathService.isPrime(value_to_check) 
	 */
	public static boolean allPrimes(ArrayList<Integer> list) {
		if(list == null || list.size() ==0) {
			return false;
		}
		for(Integer item: list) {
			if(MathService.isPrime(item) == false) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 
	 * @param list
	 * @return number of rectangles in the list that are squares
	 * (you can, and should invoke, the instance method isSquare() in class Rectangle)
	 * return 0 if list is null or empty
	 * 
	 * TIP: using the enhanced for loop will make your life much easier!
	 */
	public static int countSquares(ArrayList<Rectangle> list) {
		int count = 0;
//		if(list == null || list.size() ==0) {
//			return 0;
//		}
//		for(Rectangle item: list) {
//			if(Rectangle.isSquare(item)) {
//				count++;
//			}
//		}
		return count;

	}

	/**
	 * change each item of the list to its square.
	 * 
	 * if list is null or empty, do nothing
	 * 
	 * TIP: use set and get methods.
	 * @param list
	 * 
	 * For example,
	 * 
	 * if list = [3,0,-2,6], it should become [9, 0, 4, 36]
	 */
	public static void squareUp(ArrayList<Integer> list) {
		if(list == null || list.size() ==0) {
			return;
		}
		for(int i = 0;i<list.size();i++) {
			int item = list.get(i);
			if(list.get(i) < 0) {
				list.set(i, item*item);
			}
		}
		return; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return the sum of all even items of the list passed.
	 * return 0 if the list is null
	 */
	public static int sumEven(ArrayList<Integer> list) {
		int sum = 0;
		if(list == null || list.size() ==0) {
			return 0;
		}
		for(Integer item: list) {
			if(item % 2 == 0) {
				sum += item;
			}
		}
		return sum;
	} 

	/**
	 * 
	 * @param list
	 * @return the sum of all odd items of the list passed.
	 * return 0 if the list is null
	 */
	public static int sumOdd(ArrayList<Integer> list) {
		int sum = 0;
		if(list == null || list.size() ==0) {
			return 0;
		}
		for(Integer item: list) {
			if(item % 2 != 0) {
				sum += item;
			}
		}
		return sum;
	} 

	/**
	 * 
	 * @param list
	 * @return the sum of all positive (more than 0) items of the list passed.
	 * return 0 if the list is null
	 */
	public static int sumPositives(ArrayList<Integer> list) {
		int sum = 0;
		if(list == null || list.size() ==0) {
			return 0;
		}
		for(Integer item: list) {
			if(item > 0) {
				sum += item;
			}
		}
		return sum;
	} 	

	/**
	 * 
	 * @param list
	 * @param n
	 * @return the sum of all items of the list passed that are multiples of n.
	 * return 0 if the list is null
	 */
	public static int sumMultiples(ArrayList<Integer> list, int n) {
		int sum = 0;
		if(list == null || list.size() ==0) {
			return 0;
		}
		for(Integer item: list) {
			if(item % n == 0) {
				sum += item;
			}
		}
		return sum;
	}

	/**
	 * 
	 * @param list
	 * @param n
	 * @return the sum of all items of the list passed of which n is a multiple.
	 * return 0 if the list is null
	 */
	public static int sumFactors(ArrayList<Integer> list, int n) {
		int sum = 0;
		if(list == null || list.size() ==0) {
			return 0;
		}
		for(Integer item: list) {
			if(n % item == 0) {
				sum += item;
			}
		}
		return sum;	}

	/**
	 * 
	 * @param list
	 * @param low
	 * @param high
	 * @return sum of all items of the list passed that lie in the number range [low...high]
	 */
	public static int sumInRange(ArrayList<Integer> list, int low, int high) {
		int sum = 0;
		if(list == null || list.size() == 0) {
			return 0;
		}
		for(Integer item: list) {
			if(item >= low && item <=high) {
				sum += item;
			}
		}
		return sum; //to be completed
	} 	

	/**
	 * 
	 * @param list
	 * @param low
	 * @param high
	 * @return sum of all items of the list passed that lie OUTSIDE the number range [low...high]
	 */
	public static int sumNotInRange(ArrayList<Integer> list, int low, int high) {
		int sum = 0;
		if(list == null || list.size() == 0) {
			return 0;
		}
		for(Integer item: list) {
			if(item < low && item > high) {
				sum += item;
			}
		}
		return sum; //to be completed
	} 	

	/**
	 * 
	 * @param list
	 * @return the sum of all items at even indices of the list passed
	 */
	public static int sumEvenIndexedItems(ArrayList<Integer> list) {
		int sum = 0;
		if(list == null || list.size() == 0) {
			return 0;
		}
		for(int i = 0;i<list.size();i+=2) {
				sum += list.get(i);
		}
		return sum; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return the sum of all items at odd indices of the list passed
	 */
	public static int sumOddIndexedItems(ArrayList<Integer> list) {
		int sum = 0;
		if(list == null || list.size() == 0) {
			return 0;
		}
		for(int i = 1;i<list.size();i+=2) {
				sum += list.get(i);
		}
		return sum; //to be completed
	}

	/**
	 * 
	 * @param list
	 * reset any negative value(s) in the list passed to zero.
	 */
	public static void resetNegatives(ArrayList<Integer> list) {
		if(list == null) {
			return;
		}
		for(int i = 0;i<list.size();i++) {
			if(list.get(i) < 0) {
				list.set(i, 0);
			}
		}
		return;
	}

	/**
	 * 
	 * @param list
	 * update any negative value(s) in the list passed to positive value.
	 * for example, if list[2] is -5, it should become 5.
	 */
	public static void makeAbsolute(ArrayList<Integer> list) {
		if(list == null) {
			return;
		}
		for(int i = 0;i<list.size();i++) {
			int item = list.get(i);
			if(list.get(i) < 0) {
				list.set(i, item *-1);
			}
		}
		return;
	}

	/**
	 * 
	 * @param list
	 * @return the number of odd numbers in the list passed.
	 * return 0 if the list is null.
	 */
	public static int countOdd(ArrayList<Integer> list) {
		int counter = 0;
		if(list == null) {
			return 0;
		}
		for(Integer item : list) {
			if(item % 2 != 0) {
				counter++;
			}
		}
		return counter;
	} 

	/**
	 * 
	 * @param list
	 * @return the number of positive (more than 0) numbers in the list passed.
	 * return 0 if the list is null.
	 */
	public static int countPositives(ArrayList<Integer> list) {
		int counter = 0;
		if(list == null) {
			return 0;
		}
		for(Integer item : list) {
			if(item > 0) {
				counter++;
			}
		}
		return counter;
	} 	

	/**
	 * 
	 * @param list
	 * @return the number of negative (less than 0) numbers in the list passed.
	 * return 0 if the list is null.
	 */
	public static int countNegatives(ArrayList<Integer> list) {
		int counter = 0;
		if(list == null) {
			return 0;
		}
		for(Integer item : list) {
			if(item < 0) {
				counter++;
			}
		}
		return counter;
	} 	

	/**
	 * 
	 * @param list
	 * @param n
	 * @return the number of items in the list passed that are multiples of n.
	 * return 0 if the list is null.
	 */
	public static int countMultiples(ArrayList<Integer> list, int n) {
		int counter = 0;
		if(list == null) {
			return 0;
		}
		for(Integer item : list) {
			if(item % n == 0) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * 
	 * @param list
	 * @param n
	 * @return the number of items in the list passed of which n is a multiple.
	 * return 0 if the list is null.
	 */
	public static int countFactors(ArrayList<Integer> list, int n) {
		int counter = 0;
		if(list == null) {
			return 0;
		}
		for(Integer item : list) {
			if(n % item == 0) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * 
	 * @param list
	 * @param low
	 * @param high
	 * @return number of items in the list passed that are OUTSIDE the number range [low...high].
	 * return 0 if the list is null.
	 */
	public static int countNotInRange(ArrayList<Integer> list, int low, int high) {
		int counter = 0;
		if(list == null) {
			return 0;
		}
		for(Integer item : list) {
			if(item < low && item > high) {
				counter++;
			}
		}
		return counter;
	} 	

	/**
	 * 
	 * @param list
	 * @param target
	 * @return number of times target exists in the list passed.
	 * return 0 if list is null.
	 */
	public static int countOccurrences(ArrayList<Integer> list, int target) {
		int counter = 0;
		if(list == null) {
			return 0;
		}
		for(Integer item : list) {
			if(item == target) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * 
	 * @param list
	 * @return the number of items in the list passed that occur exactly once in the list.
	 * return 0 if list is null.
	 * HINT: use method countOccurrences
	 */
	public static int countUnique(ArrayList<Integer> list) {
		int counter = 0;
		if(list == null) {
			return 0;
		}
		for(Integer item: list) {
			if(countOccurrences(list, item) == 1) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * 
	 * @param list
	 * @param target
	 * @param startIndex
	 * @return true if target exists at index startIndex or later in the list passed, false otherwise.
	 * return false if list is null or target doesn't exist in the list starting at index startIndex.
	 */
	public static boolean containsFromIndex(ArrayList<Integer> list, int target, int startIndex) {
		if(list == null || startIndex < 0) {
			return false;
		}
		for(int i = startIndex;i<list.size();i++) {
			if(list.contains(target)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param list
	 * @param target
	 * @param endIndex
	 * @return true if target exists up to (and including) index endIndex at which target exists in the list passed, false otherwise.
	 * return false if list is null or target doesn't exist in the list up to (and including) index endIndex.
	 */
	public static boolean containsUptoIndex(ArrayList<Integer> list, int target, int endIndex) {
		if(list == null || endIndex > list.size()) {
			return false;
		}
		for(int i = 0;i<endIndex;i++) {
			if(list.contains(target)) {
				return true;
			}
		}
		return false; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @param target
	 * @param startIndex
	 * @param endIndex
	 * @return true if target exists in the index range [startIndex...endIndex] at which target exists in the list passed, false otherwise.
	 * return false if list is null or target doesn't exist in the list in the index range [startIndex...endIndex].

	 */
	public static boolean containsBetweenIndices(ArrayList<Integer> list, int target, int startIndex, int endIndex) {
		if(list == null || startIndex < 0 || endIndex > list.size()) {
			return false;
		}
		for(int i = startIndex;i<endIndex;i++) {
			if(list.contains(target)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param list
	 * @param startIndex
	 * @return sum of all items at index startIndex or higher in the list passed.
	 * return 0 if list is null.
	 */
	public static int sumFromIndex(ArrayList<Integer> list, int startIndex) {
		int sum = 0;
		if(list == null || startIndex < 0) {
			return 0;
		}
		for(int i = startIndex;i<list.size();i++) {
			sum += list.get(i);
		}
		return sum;
	}

	/**
	 * 
	 * @param list
	 * @param endIndex
	 * @return sum of all items at index endIndex or lower in the list passed.
	 * return 0 if list is null.
	 */
	public static int sumUptoIndex(ArrayList<Integer> list, int endIndex) {
		int sum = 0;
		if(list == null || endIndex > list.size()) {
			return 0;
		}
		for(int i = 0;i<endIndex;i++) {
			sum +=list.get(i);
		}
		return sum;
	} 

	/**
	 * 
	 * @param list
	 * @param startIndex
	 * @param endIndex
	 * @return sum of all items in the index range [startIndex...endIndex].
	 * return 0 if list is null.
	 */
	public static int sumBetweenIndices(ArrayList<Integer> list, int startIndex, int endIndex) {
		int sum = 0;
		if(list == null || startIndex <0 || endIndex > list.size()) {
			return 0;
		}
		for(int i = startIndex;i<endIndex;i++) {
			sum += list.get(i);
		}
		return sum;
	} 

	/**
	 * 
	 * @param list
	 * @param startIndex
	 * @return sum of all even numbers at index startIndex or later.
	 * return 0 if list is null.
	 */
	public static int sumEvenFromIndex(ArrayList<Integer> list, int startIndex) {
		int sum = 0;
		if(list == null || startIndex <0) {
			return 0;
		}
		for(int i = startIndex;i<list.size();i++) {
			if(list.get(i) % 2 == 0) {
				sum += list.get(i);
			}
		}
		return sum;

	}

	/**
	 * 
	 * @param list
	 * @param endIndex
	 * @return sum of all odd numbers up to, and including, endIndex
	 * return 0 if list is null.
	 */
	public static int sumOddUptoIndex(ArrayList<Integer> list, int endIndex) {
		int sum = 0;
		if(list == null || endIndex > list.size()) {
			return 0;
		}
		for(int i = 0;i<endIndex;i++) {
			if(list.get(i) % 2 != 0) {
				sum += list.get(i);
			}
		}
		return sum;
	}
	
	/**
	 * 
	 * @param list
	 * @param endIndex
	 * @return product of all positive items up to index endIndex.
	 * return 1 if list is null or if no positive items exist up to index endIndex.
	 */
	public static int productPositivesUptoIndex(ArrayList<Integer> list, int endIndex) {
		int prod = 1;
		if(list == null || endIndex > list.size()) {
			return 0;
		}
		for(int i = 0;i<endIndex;i++) {
			int item = list.get(i);
			if(item > 0) {
				prod *= item;
			}
		}
		return prod;
	}

	/**
	 * 
	 * @param list
	 * @param startIndex
	 * @return product of all negative items starting at index startIndex.
	 * return 1 if list is null or if no negative items exist starting at index startIndex.
	 */
	public static int productNegativesFromIndex(ArrayList<Integer> list, int startIndex) {
		int prod = 1;
		if(list == null || startIndex <0) {
			return 0;
		}
		for(int i = startIndex;i<list.size();i++) {
			int item = list.get(i);
			if(item < 0) {
				prod *= item;
			}
		}
		return prod;
	}

	/**
	 * 
	 * @param list
	 * @param key
	 * @param startIndex
	 * @param endIndex
	 * @return number of times key exists in the list between the indices startIndex and endIndex.
	 * return 0 if list is null or if key doesn't exist between indices startIndex and endIndex. 
	 */
	public static int countOccurrencesBetweenIndices(ArrayList<Integer> list, int key, int startIndex, int endIndex) {
		int count = 0;
		if(list == null || startIndex < 0 || endIndex > list.size()) {
			return 0;
		}
		for (int i = startIndex;i<endIndex;i++) {
			count = countOccurrences(list, key);
		}
		return count;
	}

	/**
	 * 
	 * @param list
	 * @param startIndex
	 * @param endIndex
	 * @return number of items that exist exactly once in the list between the indices startIndex and endIndex.
	 * return 0 if list is null or none of the items exist exactly once between indices startIndex and endIndex.
	 * HINT: use method countOccurrencesBetweenIndices
	 */
	public static int countUniqueBetweenIndices(ArrayList<Integer> list, int startIndex, int endIndex) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return true if all items of the list are positive (more than 0), false otherwise.
	 * return false if the list is null.
	 */
	public static boolean allPositives(ArrayList<Integer> list) {
		if(list == null) {
			return false;
		}
		for(int i = 0;i<list.size();i++) {
			if(list.get(i) < 0) {
				return false;
			}
		}
		return true; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return true if all items of the list are negative (less than 0), false otherwise.
	 * return false if the list is null.
	 */
	public static boolean allNegatives(ArrayList<Integer> list) {
		if(list == null) {
			return false;
		}
		for(int i = 0;i<list.size()-1;i++) {
			if(list.get(i) > 0) {
				return false;
			}
		}
		return true; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return true if all items of the list are zero, false otherwise.
	 * return false if the list is null.
	 */
	public static boolean allZeroes(ArrayList<Integer> list) {
		if(list == null) {
			return false;
		}
		for(int i = 0;i<list.size();i++) {
			if(list.get(i) != 0) {
				return false;
			}
		}
		return true; //to be completed
	}


	/**
	 * 
	 * @param list
	 * @return true if all items of the list are non-zero, false otherwise.
	 * return false if the list is null.
	 */
	public static boolean allNonZeroes(ArrayList<Integer> list) {
		if(list == null) {
			return false;
		}
		for(int i = 0;i<list.size();i++) {
			if(list.get(i) == 0) {
				return false;
			}
		}
		return true; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return true if there exists at least one positive (more than 0) value in the array, false otherwise.
	 * return false if the list is null.
	 */
	public static boolean containsPositive(ArrayList<Integer> list) {
		if(list == null) {
			return false;
		}
		for(int i = 0;i<list.size();i++) {
			if(list.get(i) > 0) {
				return true;
			}
		}
		return false; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return true if there exists at least one negative (less than 0) value in the array, false otherwise.
	 * return false if the list is null.
	 */
	public static boolean containsNegative(ArrayList<Integer> list) {
		if(list == null) {
			return false;
		}
		for(int i = 0;i<list.size();i++) {
			if(list.get(i) < 0) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param list
	 * @return true if there exists at least one zero in the array, false otherwise.
	 * return false if the list is null.
	 */
	public static boolean containsZero(ArrayList<Integer> list) {
		if(list == null) {
			return false;
		}
		for(int i = 0;i<list.size();i++) {
			if(list.get(i) == 0) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param list
	 * @return true if there exists at least one non-zero in the array, false otherwise.
	 * return false if the list is null.
	 */
	public static boolean containsNonZero(ArrayList<Integer> list) {
		if(list == null) {
			return false;
		}
		for(int i = 0;i<list.size();i++) {
			if(list.get(i) != 0) {
				return true;
			}
		}
		return false; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return true if the list is in ascending order, false otherwise.
	 * return false if the list is null.
	 */
	public static boolean isAscending(ArrayList<Integer> list) {
		if(list == null) {
			return false;
		}
		for(int i = 0;i<list.size()-1;i++) {
			if(list.get(i) > list.get(i+1)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 
	 * @param list
	 * @return true if the list is in descending order, false otherwise.
	 * return false if the list is null.
	 */
	public static boolean isDescending(ArrayList<Integer> list) {
		if(list == null) {
			return false;
		}
		for(int i = 0;i<list.size()-1;i++) {
			if(list.get(i) < list.get(i+1)) {
				return false;
			}
		}
		return true; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return true if all items of the list are the same, false otherwise.
	 * return false if the list is null.
	 */
	public static boolean isUnchanged(ArrayList<Integer> list) {
		if(list == null) {
			return false;
		}
		for(int i = 0;i<list.size()-1;i++) {
			if(list.get(i) != list.get(i+1)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 
	 * @param list
	 * @return 2 if the list is sorted in both ascending and descending order,
	 * otherwise 1 if the list is sorted in ascending order,
	 * otherwise -1 if list is sorted in descending order, 
	 * otherwise 0
	 * return 0 if list is null.
	 * 
	 * NOTE: an list like {5, 5, 5} is sorted in both ascending AND descending order
	 */
	public static int getSortedOrder(ArrayList<Integer> list) {
		int ordering = 0;
		if(list == null) {
			return 0;
		}
		for(int i = 0; i<list.size()-1;i++) {
			int k = i+1;
			if(i < k) {
				ordering = 1;
			}
			if(i == k) {
				ordering = 2;
			}
			if(i > k) {
				ordering = -1;
			}
		}
		return ordering; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return true if the list contains the same number of positive (more than 0) and negative (less than 0) items.
	 * return false if list is null.
	 */
	public static boolean isBalanced(ArrayList<Integer> list) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return true if each list.get(i) of the list is a valid digit ('0' to '9'), false otherwise.
	 * return false if list is null.
	 */
	public static boolean allDigits(ArrayList<Character> list) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return true if at least 1 item of the list is a valid digit ('0' to '9'), false otherwise.
	 * return false if list is null.
	 */
	public static boolean containsDigit(ArrayList<Character> list) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return the characters of the list converted to a String.
	 * return null if the list is null.
	 */
	public static String toString(ArrayList<Character> list) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return a copy of the list.
	 * NOTE: the list returned SHOULD NOT refer to the same collection
	 * that the list passed refers to. 
	 * In other words
	 * if you update the values in the list returned, 
	 * the values in the list passed should not change. 
	 */
	public static ArrayList<Integer> getCopy(ArrayList<Integer> list) {
		ArrayList<Integer> copy = new ArrayList<Integer>();
		if(list == null) {
			return null;
		}
		for(Integer item: list) {
			copy.add(item);
		}
		return copy; //to be completed
	}
}

