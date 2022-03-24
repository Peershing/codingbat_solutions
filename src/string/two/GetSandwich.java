package string.two;

/*
	A sandwich is two pieces of bread with something in between. Return the string that is between the first
	and last appearance of "bread" in the given string, or return the empty string "" if there are not two
	pieces of bread.
*/

public class GetSandwich {
	public String getSandwich(String str) {
		String word = "bread";
		int strLen = str.length();
		String tmpString = "";
		String result = "";
		int start = 0;
		int finish = 0;
		boolean found = false;
		   
		if (strLen <= 10) {
			return "";
		}
		   
		for (int i = 0; i < strLen - 4; i++) {
			tmpString = str.substring(i, i+5);
		     
			if (tmpString.equals(word) && found == true) {
				finish = i; 
			}
		    if (tmpString.equals(word) && found == false) {
		      start = i+5;
		      found = true;
		    }
		}
		result = str.substring(start, finish);
		return result;
	}
}
