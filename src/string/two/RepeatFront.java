package string.two;

/*
	Given a string and an int n, return a string made of the first n characters of the string, followed by the
	first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string,
	inclusive (i.e. n >= 0 and n <= str.length()).
*/

public class RepeatFront {
	public String repeatFront(String str, int n) {
		String firstN = str.substring(0, n);
		StringBuilder result = new StringBuilder("");
		  
		for (int i = 0; i < n; i++) {
			result = result.append(firstN);
			firstN = firstN.substring(0, n-i-1);
		}
		  
		return result.toString();
	}
}
