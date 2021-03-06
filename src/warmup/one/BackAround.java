package warmup.one;

/*
	Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
*/

public class BackAround {
	public String backAround(String str) {
		char last = str.charAt(str.length()-1);
		  
		return new StringBuilder(str).append(last).insert(0, last).toString();
	}
}
