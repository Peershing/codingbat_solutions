package array.one;

/*
	Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
*/

public class Double23 {
	public boolean double23(int[] nums) {
		int twoCount = 0;
		int threeCount = 0;
		  
		for (int i : nums) {
			if (i == 2) {
				twoCount++;
		    }
		    if (i == 3) {
		    	threeCount++;
		    }
		}
		  
		return (twoCount == 2 || threeCount == 2)? true : false;
	}
}
