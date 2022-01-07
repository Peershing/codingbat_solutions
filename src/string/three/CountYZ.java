package string.three;

/*
	Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez"
	count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if
	there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char
	is an alphabetic letter.)
*/

public class CountYZ {
	public int countYZ(String str) {
		str = str.toLowerCase();
		int count = 0;
		int len = str.length();
		  
		for (int i = 0; i < len; i++) {
			char letter = str.charAt(i);
		    if (letter == 'y' || letter == 'z') {
		    	if (i < len-1 && !Character.isLetter(str.charAt(i+1)) || i == len-1) {
		    		count++;
		    	}
		    }
		}
		  
		return count;
	}
}
