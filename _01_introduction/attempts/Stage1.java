package practicePackage._01_introduction.attempts;

public class Stage1 {
	/**
	 * 
	 * @param n
	 * @return square of n
	 */
	public static int square(int n) {
		
		return n*n; //done
	}

	/**
	 * 
	 * @param n
	 * @return the cube of n
	 */
	public static int cube(int n) {
		return   n*n*n; //done
	}
	
	public static double average(double a, double b) {
		return (a+b)/2; //done
	}
	
	/**
	 * 
	 * @param n (assume n >= 0)
	 * @return the last digit of the number n
	 */
	public static int lastDigit(int n) {
		int num = n%10;
		return num; //done
	}

	/**
	 * 
	 * @param n
	 * @return true if n is positive (more than 0), false otherwise
	 */
	public static boolean isPositive(int n) {
		if(n>0)
			return true;
		return false; //done
	}
/*public static boolean isPositive(int n) {
	return n < 0;
* alternative answer
*/
	/**
	 * 
	 * @param n
	 * @return true if n is even (divisible by 2), false otherwise
	 */
	public static boolean isEven(int n) {
		if(n%2==0) {
			return true;
		} else {
		return false; //done
		}
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return higher of the two integers passed
	 */
	public static int higher(int a, int b) {
		if (a == b || a > b) {
			return a;
		} else {
			return b;
		}
	 //done
	}
	
	/**
	 * assumption: one of the two values passed is even, other is odd
	 * 
	 * @param a
	 * @param b
	 * @return the value that is even
	 */
	public static int evenOne(int a, int b) {
		if (a%2==0) {
			return a;
		} else if (b%2==0) {
			return b;
		} else {
			return 0;
		}
		//done
	}

	/**
	 * 
	 * @param n
	 * @param low
	 * @param high (assume low is less than or equal to high)
	 * @return true if n is in the range [low...high], false otherwise
	 */
	public static boolean isInRange(int n, int low, int high) {
		if (n >= low && n <= high) {
			return true;
		} else {
		return false; //done
		}
	}

	/**
	 * DO NOT use Math library
	 * @param a
	 * @param b
	 * @param c
	 * @return the highest of the three integers passed
	 */
	public static int highest(int a, int b, int c) {
		if (a >= b) { 
			if (a >= c) { // if a is higher than b and c
				return a;
			} else {
				return c; // if a is larger than b but lower than c
			}
		} else if (b >= c) { 
			return b; // b is larger than a and c
		} else {
			return c; // b is larger than a but lower than c
		}
		 //done
	}
}
