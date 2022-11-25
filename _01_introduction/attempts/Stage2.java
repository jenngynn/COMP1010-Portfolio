// Cannot use Math library functions for any task

package practicePackage._01_introduction.attempts;

public class Stage2 {
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return true if exactly two out of the three values are the same, false otherwise
	 */
	public static boolean twoOutOfThree(int a, int b, int c) {
		if (a==b) { // a and c are the same val
			if (b!=c) {
				return true; // if b == c then three are the same
			} else {
				return false; // only a == b
			}
		} else if (a == c) { // a and c are the same val
			if(a!=b) {
				return true; 
			} else {
				return false;
			}
		} else if (b==c){ // b and c are the same val
			if (b!=a){
				return true; 
			} else {
				return false;
			}
		}
		return false; // if all values are different
	}

	/**
	 * 
	 * @param n (n could be positive, negative or zero)
	 * @return the last digit of the number
	 * For example,
	 * lastDigit(15) = 5
	 * lastDigit(-15) = 5
	 * lastDigit(0) = 0
	 * lastDigit(8) = 8
	 */
	public static int lastDigit(int n) {
		
		return Math.abs(n%10); //done
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return the average of the two integers passed.
	 * for example,
	 * average(5, 9) = 7 (or 7.0)
	 * average(5, 8) = 6.5
	 */
	public static double average(int a, int b) {
		return (a+b)/2.0; //done
	}

	/**
	 * 
	 * @param n
	 * @return the absolute value for n.
	 * absolute value is defined as the number without the negative sign, if any
	 * For example, absolute(-6) = 6, absolute(9) = 9
	 */
	public static int absolute(int n) {
		return Math.abs(n); //done
	}

	/**
	 * 
	 * @param val
	 * @param low
	 * @param high (assume low is less than or equal to high)
	 * @return value val constrained between low and high.
	 * that is,
	 * 
	 * if val is less than low, return low
	 * if val is more than high, return high
	 * in all other cases, return val
	 */
	public static int constrain(int val, int low, int high) {
		if(val > low && val < high) {
			return val;
		} else if (val< low) {
			return low;
		} else if (val> high) {
			return high;
		}
		return 0; //done
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @return the quadrant in which coordinate (x, y) exists
	 * quadrant 1: non-negative x, non-negative y
	 * quadrant 2: negative x, non-negative y
	 * quadrant 3: negative x, negative y
	 * quadrant 4: non-negative x, negative y
	 * 
	 */
	public static int getQuadrant(int x, int y) {
		if (x >=0 && y >=0) {
			return 1;
		} else if (x< 0 && y >= 0 ) {
			return 2;
		}else if (x<0 && y<0) {
			return 3;
		}
		return 4; //done
	}

	/**
	 * 
	 * @param val (assume val is more than or equal to zero)
	 * @return val rounded to the nearest integer.
	 */
	public static int roundOff(double val) {
		double num = val%1;
		if (num >=0.5) {
			return (int) val + 1;
		} else {
			
		return (int) val;
		}//done
	}

	/**
	 * @param val (assume val is more than or equal to zero)
	 * @return floor of val
	 * floor of a floating-point value is defined as the highest integer
	 * that is less than or equal to the value.
	 * For example, floor(4.2) = 4, floor(7.0) = 7, floor(5.9999) = 5
	 */
	public static int floor(double val) {
		int num = (int) val;
		return num; //done
	}

	/**
	 * 
	 * @param val (assume val is more than or equal to zero)
	 * @return ceiling of val
	 * ceiling of a floating-point value is defined as the smallest integer
	 * that is more than or equal to the value.
	 * For example, ceiling(4.2) = 5, ceiling(7.0) = 7,
	 * ceiling(5.9999) = 6, ceiling(-3.7) = -3
	 */
	public static int ceiling(double val) {
		if ((val%1)==0) {
			return (int) val;
		}
		return (int) val+1; //?
	}
	
	/**
	 * 
	 * @param str: assume it contains at least one character
	 * @return the last character in the String
	 */
	public static char getLastChar(String str) {
		char last = str.charAt(str.length()-1);
		return last; //done
	}
	
	/**
	 * 
	 * @param str: assume it contains at least one character
	 * @return the String with the first character removed
	 */
	public static String getWithoutFirstChar(String str) {
		
		return str.substring(1,str.length()); //done
	}
	
	/**
	 * 
	 * @param str: assume it contains at least one character
	 * @return the String with the last character removed
	 */
	public static String getWithoutLastChar(String str) {
		return str.substring(0,str.length()-1); //done
	}
}
