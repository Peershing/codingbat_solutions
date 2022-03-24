package array.one;

/*
	Given an int array length 2, return true if it does not contain a 2 or 3.
*/

public class No23 {
	public boolean no23(int[] nums) {
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
		  
		return (!twoIncluded && !threeIncluded)? true : false;
	}
}
