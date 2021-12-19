package array.two;

/*
	Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
*/

public class Either24 {
	public boolean either24(int[] nums) {
		int twoPairCount = 0;
		int wanted1 = 2;
		int fourPairCount = 0;
		int wanted2 = 4;
		  
		for (int i = 0; i+1 < nums.length; i++) {
			if (nums[i] == wanted1 && nums[i+1] == wanted1) {
				twoPairCount++;
		    }
		    else if (nums[i] == wanted2 && nums[i+1] == wanted2) {
		    	fourPairCount++;
		    }
		}
		  
		return (twoPairCount > 0 && fourPairCount == 0 || twoPairCount == 0 && fourPairCount > 0)? true : false;
	}
}
