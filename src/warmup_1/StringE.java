package warmup_1;

/*
	Return true if the given string contains between 1 and 3 'e' chars.
*/

public class StringE {
	public boolean stringE(String str) {
		int eCount = 0;
		for (char c : str.toCharArray()) {
			if (c == 'e') {
				eCount++;
		    }
		}
		  
		return (eCount >= 1 && eCount <= 3)? true : false;
	}
}
