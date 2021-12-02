package warmup.two;

/*
	Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
*/

public class DoubleX {
	boolean doubleX(String str) {
		int xCount = 0;
		for (int i = 0; i <= str.length()-2; i++) {
			if (str.charAt(i+1) == 'x' && xCount == 0 && str.charAt(i) == 'x') {
				return true;
			}
			if (str.charAt(i) == 'x') {
				xCount++;
			}
		}
		  
		return false;
	}
}
