
public class Media {
	public double length; //in seconds
	public int frameRate; //in frames per second

	/**
	 * 
	 * @param len: for length
	 * @param fps: for frameRate
	 */
	public Media(double len, int fps) {
		//to be completed
	}
	
	/**
	 * 
	 * @return the total number of pixels in the calling object
	 * For example, for a 20 second media recorded at 30 frames per second,
	 * total frames is 600.
	 */
	public int totalFrameCount() {
		return 0; //to be completed
	}
	
	/**
	 * 
	 * @param other
	 * @return 1 if calling object is "more than" parameter object
	 * -1 if calling object is "less than" parameter object
	 * 0 if calling object is "equal to" parameter object
	 * 
	 * comparison criteria: totalFrameCount
	 */
	public int compareTo(Media other) {
		return 0; //to be completed
	}
}
