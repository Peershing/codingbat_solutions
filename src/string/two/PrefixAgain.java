package string.two;

/*
	Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string
	appear somewhere else in the string? Assume that the string is not empty and that N is in the range
	1..str.length().
*/

public class PrefixAgain {
	public boolean prefixAgain(String str, int n) {
		String seq = str.substring(0, n);
		  
		for (int i = n; i < str.length()-n+1; i++) {
			if (str.substring(i, i+n).equals(seq)) {
				return true;
		    }
		}
		  
		return false;
	}
}
