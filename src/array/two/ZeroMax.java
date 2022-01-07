package array.two;

/*
	Return a version of the given array where each zero value in the array is replaced by the largest odd value to
	the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.
*/

public class ZeroMax {
	public int[] zeroMax(int[] nums) {
		boolean oddExists = false;
		int largest = -1;
		  
		for (int i = 0; i < nums.length-1; i++) {
			oddExists = false;
			largest = -1;
			if (nums[i] == 0) {
				for (int j = i+1; j < nums.length; j++) {
					if (nums[j] % 2 != 0 && nums[j] > largest) {
						oddExists = true;
						largest = nums[j];
					}
				}
				if (oddExists) {
					nums[i] = largest;
				}
			}
		}
		  
		return nums;
	}
}
