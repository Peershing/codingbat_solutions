package warmup_1;

/*
	Given a string, take the first 2 chars and return the string with the 2 chars added at
	both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2,
	use whatever chars are there.
*/

public class Front22 {
	public String front22(String str) {
		if (str.isEmpty()) {
			return "";
		}
		else if (str.length() < 2) {
			return new StringBuilder(str).append(str).insert(0, str).toString();
		    
		}
		  
		String pack = str.substring(0, 2);
		return new StringBuilder(str).append(pack).insert(0, pack).toString();
	}
}
