package string.three;

/*
	Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars
	that are the same.
*/

public class MaxBlock {
	public int maxBlock(String str) {
		int len = str.length();
		int tempCount = 1;
		int count = 0;
		  
		if (len == 0) {
			return 0;
		}
		  
		for (int i = 0; i < len; i++) {
			if (i < len-1 && str.charAt(i) == str.charAt(i+1)) {
				tempCount++;
			}
		    else {
		    	tempCount = 1;
		    }
		    
		    if (tempCount > count) {
		    	count = tempCount;
		    }
		}
		return count;
	}
}
