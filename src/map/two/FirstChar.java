package map.two;

import java.util.HashMap;
import java.util.Map;

/*
	Given an array of non-empty strings, return a Map<String, String> with a key for every different first
	character seen, with the value of all the strings starting with that character appended together in
	the order they appear in the array.
*/

public class FirstChar {
	public Map<String, String> firstChar(String[] strings) {
		Map<String, String> result = new HashMap<>();
		  
		for (String s : strings) {
			String fLetter = s.substring(0, 1);
		    if (result.containsKey(fLetter)) {
		    	result.put(fLetter, result.get(fLetter)+s);
		    }
		    else {
		    	result.put(fLetter, s);
		    }
		}
		  
		return result;
	}
}
