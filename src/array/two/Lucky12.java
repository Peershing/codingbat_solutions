package array.two;

/*
	Given an array of ints, return true if the array contains no 1's and no 3's.
*/

public class Lucky12 {
	public boolean lucky13(int[] nums) {
		int forbidden1 = 1;
		int forbidden2 = 3;
		  
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == forbidden1 || nums[i] == forbidden2) {
				return false;
		    }
		}
		  
		return true;
	}
}
