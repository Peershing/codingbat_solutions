package array.one;

/*
	Given an int array length 2, return true if it contains a 2 or a 3.
*/

public class Has23 {
	public boolean has23(int[] nums) {
		boolean twoIncluded = false;
		boolean threeIncluded = false;
		for (int i : nums) {
			if (i == 2) {
				twoIncluded = true;
			}
			if (i == 3) {
				threeIncluded = true;
			}
		}
		
		return (twoIncluded || threeIncluded)? true : false;
	}
}
