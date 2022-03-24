package warmup.one;

/*
	Given 2 int values, return true if one is negative and one is positive. Except if the parameter
	"negative" is true, then return true only if both are negative.
*/

public class PosNeg {
	public boolean posNeg(int a, int b, boolean negative) {
		if (negative == true && a < 0 && b < 0) {
			return true;
		}
		return (a*b < 0 && negative == false)? true : false;
	}
}
