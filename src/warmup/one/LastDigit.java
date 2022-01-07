package warmup.one;

/*
	Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
	Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
*/

public class LastDigit {
	public boolean lastDigit(int a, int b) {
		return (a % 10 == b % 10)? true : false;
	}
}