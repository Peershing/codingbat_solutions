package warmup_1;

/*
	Given three int values, a b c, return the largest.
*/

public class IntMax {
	public int intMax(int a, int b, int c) {
		if (a > b) {
			a = a ^ b ^ (b = a);
		}
		if (b > c) {
			b = b ^ c ^ (c = b);
		}
		if (a > b) {
		    a = a ^ b ^ (b = a);
		}
		  
		return c;
	}
}
