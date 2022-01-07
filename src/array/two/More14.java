package array.two;

/*
	Given an array of ints, return true if the number of 1's is greater than the number of 4's
*/

public class More14 {
	public boolean more14(int[] nums) {
		int oneCount = 0;
		int fourCount = 0;
		  
		for (int n : nums) {
			if (n == 1) {
				oneCount++;
		    }
		    else if (n == 4) {
		    	fourCount++;
		    }
		}
		  
		return (oneCount > fourCount)? true : false;
	}
}
