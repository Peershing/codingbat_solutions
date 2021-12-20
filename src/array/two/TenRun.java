package array.two;

/*
	For each multiple of 10 in the given array, change all the values following it to be that multiple of 10,
	until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
*/

public class TenRun {
	public int[] tenRun(int[] nums) {
		for (int i = 0; i < nums.length-1; i++) {
			if (isTenMultiple(nums[i])) {
				for (int j = i+1; j < nums.length && !isTenMultiple(nums[j]); j++) {
					nums[j] = nums[i];
				}
			}
		}
		  
		return nums;
	}

	public boolean isTenMultiple(int n) {
		return (n % 10 == 0);
	}
}
