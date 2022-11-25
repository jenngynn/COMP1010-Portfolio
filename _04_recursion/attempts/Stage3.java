package practicePackage._04_recursion.attempts;

public class Stage3 {
	/**
	 * 
	 * @param str
	 * @return the reverse of the string
	 * return null if string is null
	 */
	public static String reverse(String str) {
		if(str == null || str.length()<=1) {
			return null;
		}
		return reverse(str.substring(1))+str.charAt(0);
	}
	
	/**
	 * 
	 * @param n
	 * @param loc
	 * @return the number with digit at location loc removed (if any).
	 * note: the least significant digit is at location 1, the secon-least significant digit is at location 2, and so on.
	 */
	public static int removeDigit(int n, int loc) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param str
	 * @return true if string is a palindrome (same when reversed), 
	 * false otherwise
	 * 
	 * return false if Sting is null
	 */
	public static boolean isPalindrome(String str) {
		if(str == null) {
			return false;
		}
		 int n = str.length();
	       if (n == 0) // empty string is palindrome
	           return true;
	       return isPalRec(str, 0, n - 1);
	   }
	   static boolean isPalRec(String str, int start, int end){
	           if (start == end) //if there is only character
	               return true;
	           if ((str.charAt(start)) != (str.charAt(end)))//if the start and end doest not match the it is not palindrome
	               return false;
	           if (start < end + 1) //If there are more than two characters, check if middle substring is also palindrome or not.
	               return isPalRec(str, start + 1, end - 1);
	           return true;
	       }

	/**
	 * 
	 * @param x
	 * @param n (n COULD be negative)
	 * @return x to the power of n
	 * IMPORTANT: for any integer x, x to the power of 0 is 1
	 * 
	 *  For example:
	 *  
	 *  powerV2(2, 5) = 32
	 *  powerV2(2, -3) = 0.125
	 *  powerV2(-2, -3) = -0.125
	 *  powerV2(2, -5) = 0.03125
	 *  powerV2(3, -2) = 0.11111
	 *  
	 *  HINT 1: x^(-n) is 1/(x^n)
	 *  HINT 2: you can call power from Stage1
	 */
	public static double powerV2(int x, int n) {
		if(n == 0) {
			return 1;
		}
		if(n < 0) {
			return 1/(x*x + powerV2(x,Math.abs(n)));
		}
		return x*x + powerV2(x, n-1);
		 //to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if the first digits of a and b are the same, false otherwise
	 */
	public static boolean sameFirstDigit(int a, int b) {
		return false;
	}

	/**
	 * 
	 * @param n (assume n is more than or equal to zero)
	 * @param destBase (assume destBase is a number between 2 and 10)
	 * @return the number in destBase base.
	 * for example,
	 * convert(13, 2) returns "1101" since 13 in base-2 is 1101 (1*8 + 1*4 + 0*2 + 1*1 = 13)
	 * convert(19, 3) returns "201" since 19 in base-3 is 211 (2*9 + 0*3 + 1*1 = 19)
	 * convert(1905, 8) returns "3561" since 1905 in base-8 is 3561 (3*512 + 5*64 + 6*8 + 1*1 = 1905)
	 */
	public static String convert(int n, int destBase) {
		return "0"; //to be completed
	}

	/**
	 * 
	 * @param str
	 * @param pattern
	 * @param replacement
	 * @return a modified version of str where all occurrences of pattern
	 * are replaced by replacement
	 * 
	 * For example,
	 * replaceAll("this is better than the other thing", "th", "sup") 
	 * returns the String "supis is better supan supe osuper suping"
	 * 
	 */
	public static String replaceAll(String str, String pattern, String replacement) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param n
	 * @param d: single digit integer
	 * @return the number of occurrences of digit d in integer n, 
	 * except when target (d) appears twice in a row, 
	 * the second one counts twice
	 *  
	 * For example, 
	 * 
	 * if countWeighted(8818, 8) returns 4. 
	 * 
	 * Explanation:
	 * 
	 * First 8 (from left) contributes 1
	 * Second 8 contributes 2 (since there is another 8 immediately to its left)
	 * Third 8 contributes 1
	 * 
	 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
	 * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
	 */
	public static int countWeighted(int n, int d) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param str
	 * @param tokens
	 * @return true if str contains all characters from token, false otherwise
	 * Note if tokens contains multiple occurrences of a particular character,
	 * then str must have at least as many occurrences of that character.
	 */
	public static boolean contains(String str, String tokens) {
		return false; //to be completed
	}
	
	/**
	 * 
	 * @param n
	 * @return the number with the first digit removed
	 * you may, and should use functions from stages 1 and 2
	 */
	public static int withoutFirstDigit(int n) {
		return 0; //to be completed
	}
	
	/**
	 * 
	 * @param n
	 * @return the highest number that can be formed by re-arranging the digits of n.
	 */
	public static int highestNumber(int n) {
		return 0; //to be completed
	}
	
	/**
	 * 
	 * @param n
	 * @return the smallest number that can be formed by re-arranging the digits of n.
	 */
	public static int smallestNumber(int n) {
		return 0;
	}

	/**
	 * 
	 * @param n
	 * @return the smallest even number that can be formed by re-arranging the digits of n.
	 */
	public static int smallestEvenNumber(int n) {
		return 0; //to be completed
	}
	
	/**
	 * two Strings are anagrams of each other if you can rearrange one to form the other one.
	 * @param s1
	 * @param s2
	 * @return true if s1 and s2 are anagrams of each other, false otherwise
	 */
	public static boolean areAnagrams(String s1, String s2) {
		return false; //to be completed
	}
	
//	public static boolean biggestEvenNumber(int n) {
//		
//	}

	@SuppressWarnings("unused")
	private String[] morseCodes = {".-","-...","-.-.","-..",".",
			"..-.","--.","....","..",".---",
			"-.-",".-..","--","-.","---",
			".--.","--.-",".-.","...","-",
			"..-","...-",".--","-..-",
			"-.--","--.."};

	/**
	 * 
	 * @param message
	 * @return a String containing morse code for message passed.
	 * return null if string is null. return "" is string is ""
	 * IMPORTANT lookup array provided as variable morseCodes
	 * Use / as a space
	 * Use space to separate morse codes for two letters
	 * The returned value ends with a space for all non-null, non-empty inputs
	 * For example, 
	 * if message = "nice one", return "-. .. -.-. . / --- -. . "
	 */
	public static String getMorse(String message) {
		//morseCodes[i] gives the equivalent morse code for letter (char)('a' + i)
		//'b' -> morseCodes[1]
		//'k' ('a' + 10) -> morseCodes[10]
		return null; //to be completed		
	}

	/**
	 * a polynomial is defined as 
	 * (c_0 *  x^0) +  (c_1 *  x^1) + ... (c_n *  x^n)
	 * 
	 * For example, take the polynomial 3 + 5x - 7(x^2) + 9(x^5)
	 * c_0 = 3
	 * c_1 = 5
	 * c_2 = -7
	 * c_3 = 0
	 * c_4 = 0
	 * c_5 = 9
	 * this is represented as the array coefficients {3, 5, -7, 0, 0, 9}
	 * 
	 * when we plug in the value of x = 2, 
	 * it evaluates to (2^0)*3 + (2^1)*5 + ... + (2^5)*9
	 * = 3 + 10 - 28 + 288 
	 * = 273 
	 * 
	 * @param coefficients (contains the values for the coefficients, coefficients[0] contains value for c_0)
	 * @param maxDegree (contains the highest degree to consider. the array coefficients might have 10 terms but 
	 * if maxDegree = 3, only items up to, and including index [3] should be evaluated).
	 * @param xValue
	 * @return
	 */
	public static double evaluatePolynomial(int[] coefficients, int maxDegree, int xValue) {
		return 0; //to be completed
	}
}
