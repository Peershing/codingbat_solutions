package map.two;

import java.util.HashMap;
import java.util.Map;

/*
	Given an array of strings, return a Map<String, Boolean> where each different string is a key and its
	value is true if that string appears 2 or more times in the array.
*/

public class WordMultiple {
	public Map<String, Boolean> wordMultiple(String[] strings) {
		Map<String, Boolean> result = new HashMap<>();
		  
		for (String s : strings) {
			if (result.containsKey(s)) {
				result.put(s, true);
		    }
		    else {
		    	result.put(s, false);
		    }
		}
		  
		return result;
	}
}
