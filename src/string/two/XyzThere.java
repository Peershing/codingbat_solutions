package string.two;

/*
	Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded
	by a period (.). So "xxyz" counts but "x.xyz" does not.
*/

public class XyzThere {
	public boolean xyzThere(String str) {
		String word = "xyz";
		int count = 0;
		  
		for (int i = 0; i < str.length()-word.length()+1; i++) {
			if (i == 0) {
				if (str.substring(i, i+word.length()).equals(word)) {
					count++;
				}
			}  

		    else if (str.substring(i, i+word.length()).equals(word) && str.charAt(i-1) != '.') {
		    	count++;
		    }
		}
		  
		return (count > 0)? true : false;
	}
}
