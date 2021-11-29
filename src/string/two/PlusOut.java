package string.two;

/*
	Given a string and a non-empty word string, return a version of the original String where all chars have been
	replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
*/

public class PlusOut {
	public String plusOut(String str, String word) {
		int stringLen = str.length();
		int wordLen = word.length();
		StringBuilder result = new StringBuilder("");
		   
		for (int i = 0; i < stringLen; i++) {
			if (i <= stringLen - wordLen) {
				String tmp = str.substring(i, i+wordLen);
				if (tmp.equals(word)) {
					result = result.append(word);
					i += wordLen-1;
				}
				else {
					result = result.append("+");
				}
		    }
		    else {
		    	result = result.append("+");
		    }
		}
		   
		return result.toString();
	}
}
