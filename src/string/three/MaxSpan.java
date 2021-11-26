package string.three;

/*
	Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is
	the number of elements between the two inclusive. A single value has a span of 1. Returns the largest
	span found in the given array. (Efficiency is not a priority.)
*/

public class MaxSpan {
	public int maxSpan(int[] nums) {
		int start;
		int end;
		int maxSpan = 0;
		int num;
		  
		for (int i = 0; i < nums.length; i++) {
			num = nums[i];
			start = i;
		    end = i;
		    for (int j = i+1; j < nums.length; j++) {
		    	if (nums[j] == num) {
		    		end = j;
		    	}
		    }
		    if (maxSpan < end-start+1) {
		    	maxSpan = end-start+1;
		    }
		 }
		  
		return maxSpan;
	}
}
