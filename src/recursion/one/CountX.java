package recursion.one;

/*
	Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
*/

public class CountX {
	public int countX(String str) {
		if (str.equals("x")) return 1;
		else if (str.isEmpty()) return 0;
		if (str.charAt(str.length()-1) == 'x') {
			return 1 + countX(str.substring(0, str.length()-1));
		}
		return countX(str.substring(0, str.length()-1));
	}
}
