package warmup.two;

/*
	Given an array of ints, return the number of 9's in the array.
*/

public class ArrayCount9 {
	public int arrayCount9(int[] nums) {
		if (nums == null) {
			return 0;
		}
		  
		int count = 0;
		  
		for (int n : nums) {
			if (n == 9) {
				count++;
			}
		}
		  
		return count;
	}
}
