package functional.two;

import java.util.List;

/*
	Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
*/

public class No34 {
	public List<String> no34(List<String> strings) {
		strings.removeIf(s -> s.length()==3 || s.length()==4);
		return strings;
	}
}
