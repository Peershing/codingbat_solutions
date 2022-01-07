package functional.one;

import java.util.List;

/*
	Given a list of strings, return a list where each string has "y" added at its start and end.
*/

public class MoreY {
	public List<String> moreY(List<String> strings) {
		strings.replaceAll(s -> s = "y"+s+"y");
		return strings;
	}
}
