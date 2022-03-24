package string.two;

/*
	Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number
	of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.
*/

public class XyzMiddle {
	public boolean xyzMiddle(String str) {
		if (str.length() < 3) {
			return false;
		}
		  
		String seq = "xyz";
		int start = 0;
		int end = 0;
		boolean seqExists = false;
		int leftCount = 0;
		int rightCount = 0;
		  
		for (int i = 0; i < str.length()-seq.length()+1; i++) {
			if (str.substring(i, i+seq.length()).equals(seq)) {
				start = i;
				end = i+seq.length()-1;
				leftCount = start;
				rightCount = str.length()-end-1;
		      
				if (Math.abs(leftCount-rightCount) <= 1) {
					return true;
				}
		    }
		}
		  
		return false;
	}
}
