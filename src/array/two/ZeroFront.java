package array.two;

/*
	Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros
	are grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1}
	becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
*/

public class ZeroFront {
	public int[] zeroFront(int[] nums) {
		  int[] result = nums;
		  int index = 0;
		  
		  for (int i = nums.length-1; i >= 0; i--) {
		    index = 0;
		    if (result[i] == 0) {
		    	while (result[index] == 0 && index < i) {
		    		index++;
		    	}
		    	result[i] = result[i] ^ result[index] ^ (result[index] = result[i]);
		    }
		  }
		  
		  return result;
	}
}
