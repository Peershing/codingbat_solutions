package map_2;

import java.util.HashMap;
import java.util.Map;

/*
	We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
	Loop over and then return the given array of non-empty strings as follows: if a string matches
	an earlier string in the array, swap the 2 strings in the array. When a position in the array
	has been swapped, it no longer matches anything. Using a map, this can be solved making just one
	pass over the array. More difficult than it looks.
*/

public class AllSwap {
	public String[] allSwap(String[] strings) {
		Map<String, Integer> indeces = new HashMap<>();
		  
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].isEmpty()) continue;
		    String fLetter = strings[i].substring(0, 1);
		    if (!indeces.containsKey(fLetter)) {
		    	indeces.put(fLetter, i);
		    }
		    else {
		    	String prevString = strings[indeces.get(fLetter)];
		    	strings[indeces.get(fLetter)] = strings[i];
		    	strings[i] = prevString;
		      
		    	indeces.remove(fLetter);
		    }
		}
		  
		return strings;
	}
}
