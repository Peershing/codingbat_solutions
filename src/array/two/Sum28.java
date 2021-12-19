package array.two;

/*
	Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
*/

public class Sum28 {
	public boolean sum28(int[] nums) {
		int twoSum = 0;
		int wanted = 8;
		  
		for (int n : nums) {
			if (n == 2) {
				twoSum += n;
		    }
		}
		  
		return (twoSum == wanted)? true : false;
	}
}
