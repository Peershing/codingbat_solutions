package string.two;

/*
	Return a version of the given string, where for every star (*) in the string the star and the chars immediately
	to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
*/

public class StarOut {
	public String starOut(String str) {
		int len = str.length();
		String finalString = "";
		  
		for (int i = 0; i < len; i++) {
			if (i == 0 && str.charAt(i) != '*') {
				finalString += str.charAt(i);
			}
		  
		    if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*') {
		    	finalString += str.charAt(i);
		    }
		      
		      
		    if (i > 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*') {
		    	finalString = finalString.substring(0,finalString.length()-1);
		    }
		}
		return finalString;
	}
}
