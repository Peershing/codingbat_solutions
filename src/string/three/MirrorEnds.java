package string.three;

/*
	Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
	In other words, zero or more characters at the very begining of the given string, and at the very end of the
	string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
*/

public class MirrorEnds {
	public String mirrorEnds(String string) {
		int len = string.length();
		String temp1 = "";
		String temp2 = "";
		String result = "";

		for (int i = 0; i < len; i++) {
			temp1 += string.substring(i, i+1);
		    temp2 = "";
		    for (int j = temp1.length()-1; j >= 0; j--) {
		    	temp2 += temp1.substring(j, j+1);
		    	if (temp2.equals(string.substring(len-i-1, len))) {
		    		result = temp1;
		    	}
		    }
		}
		  
		return result;
	}
}
