package recursion.one;

/*
	Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively
	(without loops).
*/

public class Factorial {
	public int factorial(int n) {
		if (n == 1) return 1;
		  
		return n * factorial(n-1);
	}
}
