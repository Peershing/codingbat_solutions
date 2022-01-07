package array.two;

/*
	Given an array of ints, return true if every 2 that appears in the array is next to another 2.
*/

public class TwoTwo {
	public boolean twoTwo(int[] nums) {
		int wanted = 2;
		  
		if (nums.length == 2) {
			if ((nums[0] == wanted && nums[1] != wanted) || (nums[0] != wanted && nums[1] == wanted)) {
				return false;
		    }
		}
		else if (nums.length == 1 && nums[0] == wanted) {
		    return false;
		}
		  
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && i < nums.length-1) {
				if (nums[i] == wanted && (nums[i-1] != wanted && nums[i+1] != wanted)) {
					return false;
				}
			}
		    else if (i == 0) {
		    	if (nums[0] == wanted && nums[1] != wanted) {
		    		return false;
		    	}
		    }
		    else {
		    	if (nums[nums.length-1] == wanted && nums[nums.length-2] != wanted) {
		    		return false;
		    	}
		    }
		}
		  
		return true;
	}
}
