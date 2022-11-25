// Cannot use Math library functions for any task

package practicePackage._01_introduction.attempts;

public class Stage3 {
	/**
	 * 
	 * @param n (assume n is more than 0)
	 * @return the sum of the first n positive integers (1+2+...+n)
	 */
	public static int sum(int n) {
		int num = 0;
		for(int i = 1;i<=n;i++) {
			num+=i;
		}
		return num; //done
	}

	/**
	 * 
	 * @param n (assume n is more than 0)
	 * @return the sum of the first n positive EVEN integers (2+4+...+(2*n))
	 */
	public static int sumEvenV1(int n) {
		int num = 0;
		for (int i = 1; i<=n;i++) {
			num += i*2;
		}
		return num; //done
	}

	/**
	 * 
	 * @param n (assume n is more than 0)
	 * @return the sum of the first n positive ODD integers (1+3+...+(2*n-1))
	 */
	public static int sumOddV1(int n) {
		int num = 0;
		for (int i = 1; i<=n;i++) {
			num = num + (2*i-1);
		}
		return num; //done
	}

	/**
	 * 
	 * @param n (assume n is more than 0)
	 * @return the sum of all positive even integers up to, and including n  
	 * either (2+4+...+n) or (2+4+...+(n-1))
	 */
	public static int sumEvenV2(int n) {
		int num =0;
			for (int i = 1; i<=n;i++) {
				if (i%2==0) {
					num += i;
				}
			}
			return num;

		}
		 //done
	/**
	 * 
	 * @param n (assume n is more than 0)
	 * @return the sum of all positive odd integers up to, and including n  
	 * either (1+3+...+n) or (1+3+...+(n-1))
	 */
	public static int sumOddV2(int n) {
		int num =0;
		for (int i = 1; i<=n;i++) {
			if (i%2!=0) {
				num += i;
			}
		}
		return num;  //done
	}

	/**
	 * 
	 * @param n
	 * @return the product of the first n positive integers.
	 * for example, if n = 5, return 1*2*3*4*5 = 120
	 * return 1 if n < 1
	 */
	public static int product(int n) {
		int num = 1;
		if (n < 1) return 1; // if n is negative
		else {
			for(int i = 1;i<=n;i++) {
				num*=i;
			}
			return num;
			//done
		}
	}

	/**
	 * 
	 * @param n
	 * @return the product of the first n positive even integers.
	 * for example, if n = 5, return 2*4*6*8*10 = 3840
	 * return 1 if n < 1
	 */
	public static int productEven(int n) {
		int num = 1;
		if (n<1) { // if n is negative
			return 1;
		} else {
			for(int i = 2;i<=n*2;i+=2) {
					num*=i;
			}
			return num; //to be completed
		}
	}

	/**
	 * 
	 * @param n
	 * @return the productOdd of the first n odd positive integers.
	 * for example, if n = 5, return 1*3*5*7*9 = 945
	 * return 1 if n < 1
	 */
	public static int productOdd(int n) {
		int num = 1;
		if (n<1) return 1; // if n is negative
		else{
			for (int i = 1; i <=n*2; i+=2) {
			num *=i;
			}
		} //done
		return num;
	}

	/**
	 * 
	 * @param n
	 * @return the number of digits in n.
	 * For example, 
	 * if n = 5, return 1.
	 * if n = 18, return 2.
	 * if n = 20478, return 5.
	 * 
	 * Note: return 0 if n is less than or equal to 0.
	 */
	public static int countDigits(int n) {
		if (n <= 0) {
			return 0;
		} else {
			int counter = 0;
			while (n!=0) {
				n =  n/10;
				counter++;
			}
			return counter;
		} //to be completed
	}

	/**
	 * 
	 * @param x
	 * @param n (assume n is more than or equal to 0)
	 * @return x to the power of n without using Math library
	 */
	public static int power(int x, int n) {
		int num = 1;
		for (int i = 1;i<=n;i++) {
			num = num*x;
		}
			
		return num; //done
	}

	/**
	 * 
	 * @param data: assume it's not null
	 * @return the sum of all items in data
	 */
	public static int sum(int[] data) {
		int num = 0;
		for (int i = 0;i<=data.length-1;i++) {
			num+=data[i];
		}
		return num; //done
	}

	/**
	 * 
	 * @param data: assume it's not null
	 * @return the sum of all even numbers in data
	 */
	public static int sumEven(int[] data) {
		int num = 0;
		for(int i = 0;i<=data.length-1;i++) {
			if(data[i]%2==0) {
				num+=data[i];
			}
		}
		return num; //done

	}
}
