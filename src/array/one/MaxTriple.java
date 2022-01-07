package array.one;

/*
	Given an array of ints of odd length, look at the first, last, and middle values in the array and return
	the largest. The array length will be a least 1.
*/

public class MaxTriple {
	public int maxTriple(int[] nums) {
		if (nums.length > 1) {
			int first = nums[0];
			int middle = nums[nums.length/2];
		    int last = nums[nums.length-1];
		    
		    if (first > middle) {
		    	first = first ^ middle ^ (middle = first);
		    }
		    if (middle > last) {
		    	middle = middle ^ last ^ (last = middle);
		    }
		    if (first > middle) {
		    	first = first ^ middle ^ (middle = first);
		    }
		    
		    return last;
		}
		
		return nums[0];
	}
}
