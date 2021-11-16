package warmup_1;

/*	
	Given a non-empty string and an int n, return a new string where the char at index n has been removed.
	The value of n will be a valid index of a char in the original string
	(i.e. n will be in the range 0..str.length()-1 inclusive).	
*/

public class MissingChar {
	public String missingChar(String str, int n) {
		return new StringBuilder(str).deleteCharAt(n).toString();
	}
}
