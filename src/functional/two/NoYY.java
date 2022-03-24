package functional.two;

import java.util.List;

/*
	Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings
	that contain "yy" as a substring anywhere.
*/

public class NoYY {
	public List<String> noYY(List<String> strings) {
		strings.replaceAll(s -> s+"y");
		strings.removeIf(s -> s.contains("yy"));
		return strings;
	}
}
