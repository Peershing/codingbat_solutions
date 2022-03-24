package logic.two;

/*
	Given three ints, a b c, one of them is small, one is medium and one is large.
	Return true if the three values are evenly spaced, so the difference between small
	and medium is the same as the difference between medium and large.
*/

public class EvenlySpaced {
	public boolean evenlySpaced(int a, int b, int c) {
		if (a > b) {
		    a = a ^ b ^ (b=a);
		}
		if (b > c) {
		    b = b ^ c ^ (c=b);
		}
		if (a > b) {
		    a = a ^ b ^ (b=a);
		}
		  
		return (a-b == b-c)? true : false;
	}
}
