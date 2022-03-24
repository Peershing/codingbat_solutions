package warmup.one;

/*	
	Given a string, return a new string where the first and last chars have been exchanged.	
*/

public class FrontBack {
	public String frontBack(String str) {
		if (str.isEmpty()) {
			return ""; 
		}
		  
		char first = str.charAt(0);
		char last = str.charAt(str.length()-1);
		  
		StringBuilder sb = new StringBuilder(str);
		sb.setCharAt(0, last);
		sb.setCharAt(str.length()-1, first);
		  
		return sb.toString();
	}
}
