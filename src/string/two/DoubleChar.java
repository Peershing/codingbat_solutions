package string.two;

/*
	Given a string, return a string where for every char in the original, there are two chars.
*/

public class DoubleChar {
	public String doubleChar(String str) {
		StringBuilder result = new StringBuilder("");
		for (char c : str.toCharArray()) {
			result = result.append(c).append(c);
		}
		  
		return result.toString();
	}
}
