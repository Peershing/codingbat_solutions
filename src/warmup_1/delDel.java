package warmup_1;

/*
	Given a string, if the string "del" appears starting at index 1, return a string where that "del"
	has been deleted. Otherwise, return the string unchanged.
*/

public class delDel {
	public String delDel(String str) {
		if (str.length() < 4) {
			return str;
		}
		  
		if (str.substring(1, 4).equals("del")) {
			StringBuilder sb = new StringBuilder(str).replace(1, 4, "");
			return sb.toString();
		}
		else {
			return str;
		}
	}
}
