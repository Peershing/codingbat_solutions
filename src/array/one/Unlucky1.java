package array.one;

/*
	We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
	Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
*/

public class Unlucky1 {
	public boolean unlucky1(int[] nums) {
		if (nums.length < 2) {
			return false;
		}

		for (int i = 0; i < 2; i++) {
			if (nums[i] == 1 && nums[i+1] == 3) {
				return true;
		    }
		}
		if (nums[nums.length-2] == 1 && nums[nums.length-1] == 3) {
			return true;
		}
		  
		return false;
	}
}
