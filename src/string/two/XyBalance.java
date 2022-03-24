package string.two;

/*
	We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char
	somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
	Return true if the given string is xy-balanced.
*/

public class XyBalance {
	public boolean xyBalance(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (i != str.length()-1) {
				if (str.charAt(i) == 'x') {
					int countY = 0;
					for (int j = i+1; j < str.length(); j++) {
						if (str.charAt(j) == 'y') {
							countY++;
						}
					}
					if (countY == 0) {
						return false;
					}
				}
		    }
		    else if (str.charAt(i) == 'x') {
		      return false;
		    }
		}
		  
		return true;
	}
}
