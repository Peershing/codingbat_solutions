package functional.one;

import java.util.List;

/*
	Given a list of strings, return a list where each string is converted to lower case
	(Note: String toLowerCase() method).
*/

public class Lower {
	public List<String> lower(List<String> strings) {
		strings.replaceAll(s -> s.toLowerCase());
		return strings;
	}	
}
