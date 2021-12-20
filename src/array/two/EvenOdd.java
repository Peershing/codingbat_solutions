package array.two;

/*
	Return an array that contains the exact same numbers as the given array, but rearranged so that all the even
	numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify
	and return the given array, or make a new array.
*/

public class EvenOdd {
	public int[] evenOdd(int[] nums) {
		int[] result = nums;
		int index = 0;
		  
		for (int i = nums.length-1; i >= 0; i--) {
			index = 0;
			if (!isOdd(result[i])) {
				while (!isOdd(result[index]) && index < i) {
					index++;
				}
				result[i] = result[i] ^ result[index] ^ (result[index] = result[i]);
		    }
		}
		  
		return result;
	}

	public boolean isOdd(int n) {
		return (n % 2 != 0)? true : false;
	}
}
