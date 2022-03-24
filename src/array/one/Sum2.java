package array.one;

/*
	Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less
	than 2, just sum up the elements that exist, returning 0 if the array is length 0.
*/

public class Sum2 {
	public int sum2(int[] nums) {
		int sum = 0;
		int elemCount = 0;
		for (int i : nums) {
			elemCount++;
			if (elemCount > 2) {
				break;
			}
			sum += i;
		}
		  
		return sum;
	}
}
