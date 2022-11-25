package practicePackage._03_classesObjects.attempts;

/**
 * 
 * @author gauravgupta
 * Box represents a three dimensional cuboid. We use the front perspective
 * such that 
 * the side from front to back is depth
 * the side from top to bottom is height
 * the side from left to right is width
 * 
 * IMPORTANT: Do NOT override equals()
 */
public class Box {
	public int depth, height, width;

	/**
	 * 
	 * NOTE: if any of the values are less than 1, they should be made 1 before copying into 
	 * corresponding instance variable
	 * @param d (for depth)
	 * @param h (for height)
	 * @param w (for width)
	 */
	public Box(int d, int h, int w) {
		if(d < 1) {
			depth = 1;
		} else {
			depth = d;
		}
		if(h < 1 ) {
			height = 1;
		} else {
			height = h;
		}
		if (w < 1) {
			width = 1;
		} else {
			width = w;
		}
	}//pass

	/**
	 * copy constructor to create an instance copy of the passed object
	 * @param original
	 */
	public Box(Box original) {
		this.depth = original.depth;
		this.height = original.height;
		this.width = original.width;
		
		
	}//pass

	/**
	 * @return String representation. 
	 * for example, if depth = 3, height = 2, width = 5, it should return
	 * "3 x 2 x 5"
	 */
	public String toString() {
		return depth + " x " + height + " x " + width;
	}

	/**
	 * 
	 * @return the volume of the box
	 */
	public int volume() {
		return depth*height*width;

	}
	
	/**
	 * 
	 * @return the longest side of the box
	 */
	public int longestSide() {
		if(depth > height) {
			if(depth > width) {
				return depth;
			}
			return width;
		} else { //height > depth
			if(height > width) {
				return height;
				}
			return width;
		}
	}

	/**
	 *
	 * @return area of the base (or the top)
	 */
	public int baseArea() {
		return width*depth;
	}

	/**
	 * 
	 * @return area of the front (or the back face)
	 */
	public int frontArea() {
		return width*height;
	}

	/**
	 * 
	 * @return area of the left (or right) face
	 */
	public int sideArea() {
		return depth*height;
	}

	/**
	 * 
	 * @return the surface area of the box
	 */
	public int surfaceArea() {
		return 2*(sideArea() + frontArea() + baseArea());
	}//pass

	/**
	 * 
	 * @return the area of the largest surface (base/front/side)
	 */
	public int largestFaceArea() {
		int s = sideArea();
		int b = baseArea();
		int f = frontArea();
		if (s > b) {
			if(s > f) {
				return s;
			}
			return f;
		} else { // b > s
			if(b > f) {
				return b;
			}
			return f;
		}
	}//pass

	/**
	 * 
	 * @param other
	 * @return 1 if calling object is "more than" parameter object
	 * -1 if calling object is "less than" parameter object
	 * 0 if calling object is "equal to" parameter object
	 * comparison criteria: volume -> surface area
	 *
	 */
	public int compareTo(Box other) { //volume -> surface area
		if (volume() > other.surfaceArea())
			return 1;
		
		if (volume() < other.surfaceArea()) 
			return -1;
		
		return 0;
	}

	/**
	 * D
	 * @param b
	 * @return true if the box represented by the calling object
	 * can fit inside the box represented by the parameter object, false otherwise.
	 * Note that a box cannot fit inside the box of the same dimension.
	 */
	public boolean canFitInside(Box b) {
		if(this.volume() >= b.volume()) {
			return false;
		}
		return true;
	}

	/**
	 * D
	 * @param other
	 * @return true if the calling object is identical to
	 * the parameter object when orientation is not considered.
	 * so 3 x 2 x 5 and 5 x 2 x 3 are identical. 
	 */
	public boolean isIdenticalTo(Box other) {
		return this.volume() == other.volume();	
	}
	
	/**
	 * HD
	 * @param other
	 * @return 1 if calling object is "more than" parameter object
	 * -1 if calling object is "less than" parameter object
	 * 0 if calling object is "equal to" parameter object
	 * comparison criteria: volume -> surface area -> longest sides -> second longest sides -> shortest side
	 */
	public int compareToAdvanced(Box other) { 
		return 0;
	}
}
