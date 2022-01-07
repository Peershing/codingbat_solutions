package array.one;

/*
	Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
	Return the changed array.
*/

public class Fix23 {
	public int[] fix23(int[] nums) {
		int[] result = nums;
		for (int i = 0; i+1 < nums.length; i++) {
			if (result[i] == 2 && result[i+1] == 3) {
				result[i+1] = 0;
		    }
		}
		  
		return result;
	}
}
