package array.two;

/*
	Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
	except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest
	value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average.
	You may assume that the array is length 3 or more.
*/

public class CenteredAverage {
	public int centeredAverage(int[] nums) {
		int minNum = nums[0];
		int maxNum = nums[1];
		  
		int sum = 0;
		for (int n : nums) {
			if (n > maxNum) {
				maxNum = n;
		    }
		    if (n < minNum) {
		    	minNum = n;
		    }
		    sum += n;
		}
		  
		return (sum - minNum - maxNum) / (nums.length-2);
	}
}
