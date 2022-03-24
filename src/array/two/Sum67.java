package array.two;

/*
	Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and
	extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
*/

public class Sum67 {
	public int sum67(int[] nums) {
		int sum = 0;
		boolean section = false;
		for (int n : nums) {
			if (n == 6) {
				section = true;
				continue;
		    }
		    else if (n == 7 && section) {
		    	section = false;
		    	continue;
		    }
		    else if (section) {
		    	continue;
		    }
		    else {
		    	sum += n;
		    }
		}
		
		return sum;
	}
}
