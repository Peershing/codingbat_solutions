package array.two;

/*
	Given an array of ints, return true if every element is a 1 or a 4.
*/

public class Only14 {
	public boolean only14(int[] nums) {
		int wanted1 = 1;
		int wanted2 = 4;
		  
		for (int n : nums) {
			if (n != wanted1 && n != wanted2) {
				return false;
		    }
		}
		  
		return true;
	}
}
