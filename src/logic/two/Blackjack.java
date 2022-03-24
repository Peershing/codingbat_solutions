package logic.two;

/*
	Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
	Return 0 if they both go over.
*/

public class Blackjack {
	public int blackjack(int a, int b) {
		int limit = 21;
		  
		if (a > limit && b > limit) {
		    return 0;
		}
		else if (a > limit) {
		    return b;
		}
		else if (b > limit) {
		    return a;
		}
		return (a > b)? a : b;
	}
}
