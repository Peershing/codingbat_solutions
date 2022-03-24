package array.one;

/*
	Given an array of ints, swap the first and last elements in the array. Return the modified array.
	The array length will be at least 1.
*/

public class SwapEnds {
	public int[] swapEnds(int[] nums) {
		int[] result = nums;
		result[0] = result[0] ^ result[result.length-1] ^ (result[result.length-1] = result[0]);
		  
		return result;
	}
}
