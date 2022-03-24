package functional.one;

import java.util.List;

/*
	Given a list of strings, return a list where each string has all its "x" removed.
*/

public class NoX {
	public List<String> noX(List<String> strings) {
		strings.replaceAll(s -> s.replace("x", ""));
		return strings;
	}
}
