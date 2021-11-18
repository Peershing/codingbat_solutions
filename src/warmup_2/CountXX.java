package warmup_2;

/*
	Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
*/

public class CountXX {
	int countXX(String str) {
		if (str.length() < 2) {
			return 0;
		}
		  
		int count = 0;
		for (int i = 0; i <= str.length()-2; i++) {
			if (str.charAt(i) == 'x' && str.charAt(i+1) == 'x') {
				count++;
			}
		}
		  
		return count;
	}
}
