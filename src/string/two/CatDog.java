package string.two;

/*
	Return true if the string "cat" and "dog" appear the same number of times in the given string.
*/

public class CatDog {
	public boolean catDog(String str) {
		String word1 = "cat";
		int count1 = 0;
		String word2 = "dog";
		int count2 = 0;
		  
		for (int i = 0; i < str.length()-2; i++) {
			if (str.substring(i, i+3).equals(word1)) {
				count1++;
		    }
		    if (str.substring(i, i+3).equals(word2)) {
		    	count2++;
		    }
		}
		  
		return (count1 == count2)? true : false;
	}
}
