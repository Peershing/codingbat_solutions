package warmup_2;

/*
	Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
*/

public class StringBits {
	public String stringBits(String str) {
		StringBuilder result = new StringBuilder("");
		  
		int i = 0;
		while (i <= str.length()-1) {
		result = result.append(str.charAt(i));
			i += 2;
		}
		  
		return result.toString();
	}
}
