package warmup.one;

/*
	Given a string, return a new string where "not " has been added to the front. However,
	if the string already begins with "not", return the string unchanged.
	Note: use .equals() to compare 2 strings.
*/

public class NoString {
	public String notString(String str) {
		return (str.toLowerCase().startsWith("not"))? str : ("not " + str);
	}
}
