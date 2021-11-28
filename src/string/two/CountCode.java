package string.two;

/*
	Return the number of times that the string "code" appears anywhere in the given string, except we'll accept
	any letter for the 'd', so "cope" and "cooe" count.
*/

public class CountCode {
	public int countCode(String str) {
		String word = "code";
		int count = 0;
		  
		for (int i = 0; i < str.length()-word.length()+1; i++) {
			if (str.substring(i, i+word.length()-2).equals(word.substring(0, word.length()-2)) && str.substring(i+word.length()-1, i+word.length()).equals(word.substring(word.length()-1, word.length()))) {
				count++;
		    }
		}
		  
		return count;
	}
}
