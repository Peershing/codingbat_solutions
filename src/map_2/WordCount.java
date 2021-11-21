package map_2;

import java.util.HashMap;
import java.util.Map;

/*
	The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with
	a key for each different string, with the value the number of times that string appears in the array.
*/

public class WordCount {
	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> occurrence = new HashMap<>();
		  
		for (String s : strings) {
			if (occurrence.containsKey(s)) {
				occurrence.put(s, occurrence.get(s)+1);
		    }
		    else {
		    	occurrence.put(s, 1);
		    }
		}
		  
		return occurrence;
	}
}
