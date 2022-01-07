package array.two;

/*
	Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
*/

public class HaveThree {
	public boolean haveThree(int[] nums) {
		int wanted = 3;
		int count = 0;
		  
		for (int i = 0; i+1 < nums.length; i++) {
			if (nums[i] == wanted && nums[i+1] == wanted) {
				return false;
		    }
		    if (nums[i] == wanted) {
		    	count++;
		    }
		    if (i == nums.length-2 && nums[nums.length-1] == wanted) {
		    	count++;
		    }
		}
		  
		return (count == 3)? true : false;
	}
}
