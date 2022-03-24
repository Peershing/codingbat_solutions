package array.three;

/*
	(This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the
	same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5.
	Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's,
	and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the
	original array.
*/

public class Fix45 {
	public int[] fix45(int[] nums) {
		int fourCount = 0;
		for (int n : nums) {
			if (n == 4) {
				fourCount++;
			}
		}
		  
		int[] fiveIndeces = new int[fourCount];
		int index1 = 0;
		int[] fieldIndeces = new int[fourCount];
		int index2 = 0;
		  
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4 && i+1 <= nums.length-1 && nums[i+1] != 5) {
				fieldIndeces[index2] = i+1;
				index2++;
		    }
			else if (nums[i] == 5) {
				if (i-1 >= 0 && nums[i-1] == 4) {
					continue;
				}
				fiveIndeces[index1] = i;
				index1++;
		    }
		}
		  
		int[] result = nums;
		for (int i = 0; i < fieldIndeces.length; i++) {
			result[fieldIndeces[i]] = result[fieldIndeces[i]] ^ result[fiveIndeces[i]] ^ (result[fiveIndeces[i]] = result[fieldIndeces[i]]);
		}
		  
		return result;
	}
}
