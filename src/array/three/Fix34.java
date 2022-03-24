package array.three;

/*
	Return an array that contains exactly the same numbers as the given array, but rearranged so that every
	3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains
	the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array
	before any 4.
*/

public class Fix34 {
	public int[] fix34(int[] nums) {
		int threeCount = 0;
		for (int n : nums) {
			if (n == 3) {
				threeCount++;
		    }
		}
		  
		int[] fourIndeces = new int[threeCount];
		int index1 = 0;
		int[] fieldIndeces = new int[threeCount];
		int index2 = 0;
		  
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3 && i+1 <= nums.length-1) {
				fieldIndeces[index2] = i+1;
				index2++;
		    }
		    else if (nums[i] == 4) {
		    	fourIndeces[index1] = i;
		    	index1++;
		    }
		}
		  
		int[] result = nums;
			for (int i = 0; i < fieldIndeces.length; i++) {
				result[fieldIndeces[i]] = result[fieldIndeces[i]] ^ result[fourIndeces[i]] ^ (result[fourIndeces[i]] = result[fieldIndeces[i]]);
		}
		  
		return result;
	}
}
