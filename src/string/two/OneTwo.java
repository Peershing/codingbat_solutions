package string.two;

/*
	Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields
	"bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group
	of fewer than 3 chars at the end.
*/

public class OneTwo {
	public String oneTwo(String str) {
		StringBuilder result = new StringBuilder(str);
		  
		for (int i = 0; i+2 < result.length(); i += 3) {
			char val1 = result.charAt(i);
		    char val2 = result.charAt(i+1);
		    char val3 = result.charAt(i+2);
		    
		    result.setCharAt(i, val2);
		    result.setCharAt(i+1, val3);
		    result.setCharAt(i+2, val1);
		}
		  
		result = result.delete(result.length()-result.length()%3, result.length());
		return result.toString();
	}
}
