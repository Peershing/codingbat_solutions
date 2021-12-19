package array.two;

/*
	Given an array of ints, return true if it contains no 1's or it contains no 4's.
*/

public class No14 {
	public boolean no14(int[] nums) {
		int oneCount = 0;
		int wanted1 = 1;
		int fourCount = 0;
		int wanted2 = 4;
		  
		for (int n : nums) {
			if (n == wanted1) {
				oneCount++;
		    }
		    else if(n == wanted2) {
		    	fourCount++;
		    }
		}
		  
		return (oneCount == 0 || fourCount == 0)? true : false;
	}
}
