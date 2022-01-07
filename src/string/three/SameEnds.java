package string.three;

/*
	Given a string, return the longest substring that appears at both the beginning and end of the string without
	overlapping. For example, sameEnds("abXab") is "ab".
*/

public class SameEnds {
	public String sameEnds(String string) {
		int len = string.length();
		String temp = "";
		String result = "";
		  
		for (int i = 0; i < len; i++) {
			temp += string.charAt(i);
		    int tempLen = temp.length();
		    if (i < len/2 && temp.equals(string.substring(len-tempLen, len))) {
		    	result = temp;
		    }
		}
		  return result;
	}
}
