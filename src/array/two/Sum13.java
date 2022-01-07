package array.two;

/*
	Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13
	is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
*/

public class Sum13 {
	public int sum13(int[] nums) {
		if (nums.length > 0) {
			int sum = 0;
		    boolean prevUnlucky = false;
		    for (int n : nums) {
		    	if (n == 13) {
		    		prevUnlucky = true;
		    		continue;
		    	}
		    	if (prevUnlucky) {
		    		prevUnlucky = false;
		    		continue;
		    	}
		    	else {
		    		sum += n;
		    	}
		    }
		    
		    return sum;
		}
		return 0;
	}
}
