package array.two;

/*
	Given a non-empty array of ints, return a new array containing the elements from the original array that come
	after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid
	in java to create an array of length 0.
*/

public class Post4 {
	public int[] post4(int[] nums) {
		if (nums.length == 2 && nums[1] == 4 || nums.length < 2) {
			return new int[] {};
		}
		  
		int start = 0;
		for (int i = nums.length-1; i >= 0; i--) {
			if (nums[i] == 4) {
				start = i+1;
				break;
		    }
		}
		  
		int[] result = new int[nums.length-start];
		for (int i = 0; i < result.length; i++) {
			result[i] = nums[start];
		    start++;
		}
		  
		return result;
	}
}
