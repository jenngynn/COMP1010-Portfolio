public class GoalScoringRecord {
	public int shotsTaken, goalsScored;
	
	public GoalScoringRecord(int s, int g) {
		shotsTaken = Math.max(0, s);
		goalsScored = Math.max(0, g);
	}
	
	/**
	 * 
	 * @return conversion rate in percentage
	 */
	public double conversionRate() {
		return 100 * goalsScored / shotsTaken;
	}
	
	/**
	 * 
	 * @param other
	 * @return 1 if conversion rate of calling object is more than conversion rate of parameter object
	 * -1 if conversion rate of calling object is less than conversion rate of parameter object
	 * 0 if conversion rate of calling object is equal to conversion rate of parameter object
	 */
	public int compareTo(GoalScoringRecord other) {
		double a = this.conversionRate();
		double b = other.conversionRate();
		if(a > b){
			return 1;
		} else if (a< b) {
			return -1;
		}
		return 0; //to be completed
	}
}
	
