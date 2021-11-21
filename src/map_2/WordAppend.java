package map_2;

import java.util.HashMap;
import java.util.Map;

/*
	Loop over the given array of strings to build a result string like this: when a string appears the 2nd,
	4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string
	appears a 2nd time.
*/

public class WordAppend {
	public String wordAppend(String[] strings) {
		StringBuilder result = new StringBuilder("");
		Map<String, Integer> occurrence = new HashMap<>();
		  
		for (String s : strings) {
			if (occurrence.containsKey(s)) {
				occurrence.put(s, occurrence.get(s)+1);
				if (occurrence.get(s) % 2 == 0) {
					result = result.append(s);
				}
			}
			else {
				occurrence.put(s, 1);
			}
		}
		  
		return result.toString();
	}
}
