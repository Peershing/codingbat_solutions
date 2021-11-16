package warmup_1;

/*
	Given a string, return a new string where the last 3 chars are now in upper case.
	If the string has less than 3 chars, uppercase whatever is there.
	Note that str.toUpperCase() returns the uppercase version of a string.
*/

public class EndUp {
	public String endUp(String str) {
		if (str.isEmpty()) {
		  return "";
		}
		if (str.length() >= 3) {
		  String modifiedSeq = new StringBuilder(str).substring(str.length()-3, str.length()).toUpperCase();
		  return new StringBuilder(str).replace(str.length()-3, str.length(), modifiedSeq).toString();
		}
		  
		return str.toUpperCase();
	}
}
