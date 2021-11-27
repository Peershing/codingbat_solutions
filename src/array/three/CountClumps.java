package array.three;

/*
	Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
	Return the number of clumps in the given array.
*/

public class CountClumps {
	public int countClumps(int[] nums) {
		boolean inClump = false;
		int clumpCount = 0;
		  
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[j] == nums[i] && !inClump) {
					inClump = true;
					clumpCount++;
				}
				else if (nums[j] == nums[i]) {
					continue;
				}
				else {
					inClump = false;
					i = j-1;
					break;
				}
		    }
		}
		  
		return clumpCount;
	}
}
