package array.two;

/*
	Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
*/

public class Has22 {
	public boolean has22(int[] nums) {
		for (int i = 0; i+1 < nums.length; i++) {
			if (nums[i] == 2 && nums[i+1] == 2) {
				return true;
		    }
		}
		  
		return false;
	}
}
