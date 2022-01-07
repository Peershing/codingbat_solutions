package string.two;

/*
	Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
	the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
*/

public class MixString {
	public String mixString(String a, String b) {
		StringBuilder result = new StringBuilder("");
		boolean isALonger = a.length() > b.length();
		int size = (isALonger? b.length() : a.length());
		  
		for (int i = 0; i < size; i++) {
			result = result.append(a.charAt(i)).append(b.charAt(i));
		}
		if (isALonger && a.length() != b.length()) {
			result = result.append(a.substring(b.length(), a.length()));  
		}
		else if (a.length() != b.length()) {
			result = result.append(b.substring(a.length(), b.length()));
		}

		return result.toString();  
	}
}
