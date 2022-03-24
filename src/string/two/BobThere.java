package string.two;

/*
	Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
*/

public class BobThere {
	public boolean bobThere(String str) {
		String word = "bob";
		  
		for (int i = 0 ; i < str.length()-word.length()+1; i++) {
			if (str.substring(i, i+word.length()-2).equals(word.substring(0, 1))
		        && str.substring(i+word.length()-1, i+word.length()).equals(word.substring(word.length()-1, word.length()))) {
				return true;
		    }
		}
		  
		return false;
	}
}
