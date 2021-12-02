package map.two;

import java.util.HashMap;
import java.util.Map;

/*
	Given an array of strings, return a Map<String, Integer> containing a key for every different
	string in the array, and the value is that string's length.
*/

public class WordLen {
	public Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> result = new HashMap<>();
		  
		for (String s : strings) {
			if (!result.containsKey(s)) {
				result.put(s, s.length());
		    }
		}
		  
		return result;
	}
}
