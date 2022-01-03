package string.three;

/*
	Given two strings, base and remove, return a version of the base string where all instances of the remove
	string have been removed (not case sensitive). You may assume that the remove string is length 1 or more.
	Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
*/

public class WithoutStrings {
	public String withoutString(String base, String remove) {
		int bLen = base.length();
		int rLen = remove.length();
		String lowBase = base.toLowerCase();
		String lowRem = remove.toLowerCase();
		String result = "";

		for (int i = 0; i < bLen; i++) {
			if (i <= bLen - rLen) {
				String temp = lowBase.substring(i, i+rLen);
				if (!temp.equals(lowRem))
					result += base.substring(i, i+1);
				else {
					i += rLen-1;
				}
		    }
		    else {
		    	String temp2 = lowBase.substring(i, i+1);
		    	if (!temp2.equals(lowRem))
		    		result += base.substring(i, i+1);
		    }
		}
		  
		return result;
	}
}
