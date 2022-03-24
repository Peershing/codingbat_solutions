package warmup.one;

/*
	Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
	Use the % "mod" operator.
*/

public class Or35 {
	public boolean or35(int n) {
		return (n % 5 == 0 || n % 3 == 0)? true : false;
	}
}
