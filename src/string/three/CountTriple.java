package string.three;

/*
	We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples
	in the given string. The triples may overlap.
*/

public class CountTriple {
	public int countTriple(String str) {
		int count = 0;
		    
		for (int i = 0; i+3 <= str.length(); i++) {
			if (str.charAt(i) == str.charAt(i+1) && 
				str.charAt(i) == str.charAt(i+2))
				count++;
		}
		  
		return count;
	}
}
