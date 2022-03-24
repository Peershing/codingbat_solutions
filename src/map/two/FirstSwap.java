package map.two;

import java.util.HashMap;
import java.util.Map;

/*
	We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
	Loop over and then return the given array of non-empty strings as follows: if a string matches
	an earlier string in the array, swap the 2 strings in the array. A particular first char can
	only cause 1 swap, so once a char has caused a swap, its later swaps are disabled. Using a map,
	this can be solved making just one pass over the array. More difficult than it looks.
*/

public class FirstSwap {
	public String[] firstSwap(String[] strings) {
		Map<String, Integer> indeces = new HashMap<>();
		Map<Character, Boolean> charsUsed = new HashMap<>();
		  
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].isEmpty() || charsUsed.containsKey(strings[i].charAt(0)) && charsUsed.get(strings[i].charAt(0)) == true) continue;
		    String fLetter = strings[i].substring(0, 1);
		    
		    if (!indeces.containsKey(fLetter)) {
		    	indeces.put(fLetter, i);
		    	charsUsed.put(fLetter.charAt(0), false);
		    }
		    else {
		    	String prevString = strings[indeces.get(fLetter)];
		    	strings[indeces.get(fLetter)] = strings[i];
		    	strings[i] = prevString;
		      
		    	indeces.remove(fLetter);
		    	charsUsed.put(fLetter.charAt(0), true);
		    }
		}
		  
		return strings;
	}
}
