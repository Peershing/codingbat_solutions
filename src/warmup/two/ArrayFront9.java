package warmup.two;

/*
	Given an array of ints, return true if one of the first 4 elements in the array is a 9.
	The array length may be less than 4.
*/

public class ArrayFront9 {
	public boolean arrayFront9(int[] nums) {
		for (int i = 0; i < nums.length && i < 4; i++) {
			if (nums[i] == 9) {
				return true;
		    }
		}
		  
		return false;
	}
}
