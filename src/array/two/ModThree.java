package array.two;

/*
	Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
*/

public class ModThree {
	public boolean modThree(int[] nums) {
		for (int i = 0; i+2 < nums.length; i++) {
			if (isEven(nums[i]) && isEven(nums[i+1]) && isEven(nums[i+2]) || !isEven(nums[i]) && !isEven(nums[i+1]) && !isEven(nums[i+2])) {
				return true;
		    }
		}
		  
		return false;
	}

	public boolean isEven(int n) {
		return (n % 2 == 0);
	}
}
