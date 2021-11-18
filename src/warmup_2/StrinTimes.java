package warmup_2;

/*
	Given a string and a non-negative int n, return a larger string that is n copies of the original string.
*/

public class StrinTimes {
	public String stringTimes(String str, int n) {
		StringBuilder extended = new StringBuilder("");
		for (int i = 0; i < n; i++) {
			extended = extended.append(str);
		}
		return extended.toString();
	}
}
