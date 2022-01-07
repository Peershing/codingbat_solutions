package string.two;

/*
	Return the number of times that the string "hi" appears anywhere in the given string.
*/

public class CountHi {
	public int countHi(String str) {
		String word = "hi";
		int count = 0;
		  
		for (int i = 0; i < str.length()-1; i++) {
			if (str.substring(i, i+2).equals(word)) {
				count++;
		    }
		}
		  
		return count;
	}
}
