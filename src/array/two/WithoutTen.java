package array.two;

/*
	Return a version of the given array where all the 10's have been removed. The remaining elements should shift
	left towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So
	{1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.
*/

public class WithoutTen {
	public int[] withoutTen(int[] nums) {
		int[] result = nums;
		int tenCount = 0;
		  
		for (int i = 0; i < nums.length; i++) {
			if (result[i] == 10) {
				result[i] = 0;
				tenCount++;
		    }
		}
		  
		for (int i = 0 ; i < tenCount; i++) {
			for (int j = 0; j < result.length-1; j++) {
				if (result[j] == 0 && result[j+1] != 0) {
					result[j] = result[j] ^ result[j+1] ^ (result[j+1] = result[j]);
				}
			}
		}
		  
		return result;
	}
}
