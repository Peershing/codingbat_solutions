package array.two;

/*
	Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's
	separated by one element, such as with {7, 1, 7}.
*/

public class Has77 {
	public boolean has77(int[] nums) {
		for (int i = 0; i+2 < nums.length; i++) {
			if (nums[i] == 7 && nums[i+2] == 7 || nums[i] == 7 && nums[i+1] == 7 || nums[i+1] == 7 && nums[i+2] == 7) {
				return true;
		    }
		}
		  
		return false;
	}
}
