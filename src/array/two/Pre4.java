package array.two;

/*
	Given a non-empty array of ints, return a new array containing the elements from the original array that come
	before the first 4 in the original array. The original array will contain at least one 4. Note that it is
	valid in java to create an array of length 0.
*/

public class Pre4 {
	public int[] pre4(int[] nums) {
		if (nums.length == 2 && nums[0] == 4 || nums.length < 2) {
			return new int[] {};
		}
		  
		int end = nums.length;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				end = i-1;
				break;
			}
		}
		  
		int[] result = new int[end+1];
		for (int i = 0; i < result.length; i++) {
			result[i] = nums[i];
		}
		  
		return result;
	}
}
