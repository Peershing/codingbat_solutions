package array.one;

/*
	Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3}
	becomes {3, 2, 1}.
*/

public class Reverse3 {
	public int[] reverse3(int[] nums) {
		int[] reversed = nums;
		reversed[0] = reversed[0] ^ reversed[2] ^ (reversed[2] = reversed[0]);
		  
		return reversed;
	}
}
