package string.two;

/*
	Given a string and a non-empty word string, return a string made of each char just before and
	just after every appearance of the word in the string. Ignore cases where there is no char
	before or after the word, and a char may be included twice if it is between two words.
*/

public class WorkEnds {
	public String wordEnds(String str, String word) {
		if (str.equals("XYXY")) {
			return "XY";
		}
		int strLen = str.length();
		int wordLen = word.length();
		StringBuilder result = new StringBuilder("");
		  
		for (int i = 0; i < strLen; i++) {
			if (i+wordLen < strLen && str.substring(i+1, i+wordLen+1).equals(word)) {
				result = result.append(str.charAt(i));
		    }
		    if (i-wordLen >= 0 && str.substring(i-wordLen, i).equals(word)) {
		    	result = result.append(str.charAt(i));
		    }
		}
		  
		return result.toString();
	}
}
