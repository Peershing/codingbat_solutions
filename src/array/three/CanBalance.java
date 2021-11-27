package array.three;

/*
	Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers
	on one side is equal to the sum of the numbers on the other side.
*/

public class CanBalance {
	public boolean canBalance(int[] nums) {
		for (int i = 0; i < nums.length-1; i++) {
			int sumLeft = 0;
		    int sumRight = 0;
		    for (int j = i; j >= 0; j--) {
		    	sumLeft += nums[j];
		    }
		    for (int j = i+1; j < nums.length; j++) {
		    	sumRight += nums[j];
		    }
		    
		    if (sumLeft == sumRight) {
		    	return true;
		    }
		}
		  
		return false;
	}
}
