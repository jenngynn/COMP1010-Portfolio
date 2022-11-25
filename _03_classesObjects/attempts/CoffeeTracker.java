package practicePackage._03_classesObjects.attempts;

public class CoffeeTracker {
	public int[] coffeesPerDay;

	/**
	 * create an instance copy of data into coffeesPerDay. The two
	 * objects, data and coffeesPerDay, should have the same values but
	 * NOT refer to the same instance.
	 * @param data (you may assume data.length > 0)
	 */
	public CoffeeTracker(int[] data) {
		int[] copy = new int[data.length];
		for(int i = 0; i< copy.length;i++) {
			copy[i] = data[i];
		}
		coffeesPerDay = copy;
	}

	public int coffeesConsumed() {
		int count = 0;
		for(int i = 0;i<coffeesPerDay.length;i++) {
			count+= coffeesPerDay[i];
		}
		return count; //to be completed
	}

	public double averageCoffeesConsumed() {
		double tot = coffeesPerDay.length;
		return coffeesConsumed()/tot; //to be completed
	}

	public int coffeeFreeDays() {
		int free = 0;
		for(int i = 0 ; i< coffeesPerDay.length;i++) {
			if (coffeesPerDay[i] == 0) {
				free++;
			}
		}
		return free; //to be completed
	}
}
