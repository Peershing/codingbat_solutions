package string.two;

/*
	Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
	Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
*/

public class ZipZap {
	public String zipZap(String str) {
		StringBuilder result = new StringBuilder(str);
		  
		  
		for (int i = 1; i+1 < result.length(); i++) {
			if (result.charAt(i-1) == 'z' && result.charAt(i+1) == 'p') {
				result = result.delete(i, i+1);
		    }
		}
		  
		return result.toString();
	}
}
