package practicePackage._03_classesObjects.attempts;

/**
 * 
 * a fraction is a number of the form num/den where num and den are integers
 * and den cannot be zero.
 * examples: 5/12, -7/2, 0/20
 *
 */
public class Fraction {
	public int num; //can be anything
	public int den; //cannot be zero
 
	//DEFAULT CONSTRUCTOR
	public Fraction() {
		//DO NOT MODIFY!
		num = 0;
		den = 1;
	}


	/**
	 * constructor: assign the parameters to corresponding instance variables
	 * @param n: value for num
	 * @param d: value for den (if d is 0, den should become 1)
	 */
	public Fraction(int n, int d) {
		num = n;
		if (d == 0) {
			den = 1;
		} else {
		den = d;
		}
	}//pass

	/**
	 * 
	 * @return true if the object represents a positive fraction, like 5/2 or -7/-2
	 * false otherwise (examples: 7/-3 or -12/25)
	 */
	public boolean isPositive() {
		if((num > 0 && den > 0) || (num < 0 && den < 0)) {
			return true;
		}
		return false;
	}

	/**
	 * D level
	 * @param other
	 * @return object representing fraction that is a result of 
	 * multiplying calling object with parameter object
	 * for example:
	 * if calling object represents -3/7 and
	 * parameter object represents 12/-2
	 * 
	 * return object representing fraction -36/-14
	 */
	public Fraction multiply(Fraction other) {
		return (this.num/other.num)/(this.den/other.den);
	// TODO 
	}
	

	/**
	 * D level
	 * @return object representing the simplified form of the calling object.
	 * for example, if calling object represents -120/-64,
	 * return object representing the fraction 15/8
	 * since 
	 * -120 = 15*-8, and
	 * -64 =  8*-8
	 * 
	 *  dividing both numerator and denominator by -8, you get 15/8 
	 * 
	 */
	public Fraction getSimplifiedForm() {
		for (int i = num;i<=1;i--) {
			if (num % 1 == 0 && den % 1 == 0) {
				divisor = 1;
			}
		}
		if (divisor != 0) {
			num /= divisor;
			den /=divisor;
		}
		return num/den;
	}

}

