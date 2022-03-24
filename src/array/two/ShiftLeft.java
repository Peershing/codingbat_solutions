package array.two;

/*
	Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return
	the given array, or return a new array.
*/

public class ShiftLeft {
	public int[] shiftLeft(int[] nums) {
		int[] result = nums;
		for (int i = 0; i < nums.length-1; i++) {
			result[i] = result[i] ^ result[i+1] ^ (result[i+1] = result[i]);
		}
		  
		return result;
	}
}
