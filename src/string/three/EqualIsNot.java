package string.three;

/*
	Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number
	of appearances of "not" anywhere in the string (case sensitive).
*/

public class EqualIsNot {
	public boolean equalIsNot(String str) {
		int is = 0;
		int not = 0;
		      
		for (int i = 0; i+3 <= str.length(); i++) {
			if (str.substring(i, i+2).equals("is")) {
				is++;
		    }
		    else if (str.substring(i, i+3).equals("not")) {
		    	not++;
		    }
		}
		                                    
		if (str.length() >= 2 && str.substring(str.length()-2).equals("is"))
			is++;
		                                              
		return is == not;
	}
}
