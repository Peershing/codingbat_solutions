package map.two;

import java.util.HashMap;
import java.util.Map;

/*
	Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string
	add its first character as a key with its last character as the value.
*/

public class Pairs {
	public Map<String, String> pairs(String[] strings) {
		Map<String, String> result = new HashMap<>();
		  
		for (String s : strings) {
			if (!result.containsKey(s)) {
				result.put(s.substring(0, 1), s.substring(s.length()-1, s.length()));
		    }
		}
		  
		return result;
	}
}
