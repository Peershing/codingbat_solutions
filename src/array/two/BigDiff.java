package array.two;

/*
	Given an array length 1 or more of ints, return the difference between the largest and smallest values in
	the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of
	two values.
*/

public class BigDiff {
	public int bigDiff(int[] nums) {
		if (nums.length < 2) {
			return 0;
		}
		  
		int minNum = nums[0];
		int maxNum = nums[1];
		  
		for (int n : nums) {
			if (n > maxNum) {
				maxNum = n;
		    }
		    if (n < minNum) {
		      minNum = n;
		    }
		}
		  
		return maxNum - minNum;
	}
}
