package practicePackage._06_sorting.attempts;


public class Unit {
	String name;
	int students;

	public Unit(String name, int students) {
		this.name = name;
		this.students = students;
		
	}

	/**
	 * 
	 * @param other
	 * @return 1 if calling object is "more than" parameter object
	 * -1 if calling object is "less than" parameter object
	 * 0 if calling object is "equal to" parameter object
	 * comparison criteria: members -> name 
	 *
	 */
	public int compareTo(Unit other) {
		if(this.students > other.students) {
			return 1;
		}
		if (this.students < other.students) {
			return -1;
		}
		for(int i = 0; i <name.length();i++) {
		int ascii1 = 0;
		int ascii2 = 0;
		ascii1 = (int) this.name.charAt(i);
		ascii2 = (int) other.name.charAt(i);
		if(ascii1 > ascii2) {// calling is larger than param
			return 1;
		} else if (ascii1 < ascii2) {
			return -1;
		}
		}
		return 0;
	}
	
	public String toString() {
		return name+": "+students;
	}
	
}
