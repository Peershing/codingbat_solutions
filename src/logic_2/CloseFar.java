package logic_2;

/*
	Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.
*/

public class CloseFar {
	public boolean closeFar(int a, int b, int c) {
		int dist1 = (int) Math.abs(b-a);
		int dist2 = (int) Math.abs(c-a);
		int dist3 = (int) Math.abs(c-b);
		  
		boolean check = ((dist1 <= 1 || dist2 <= 1) && (dist1 >= 2 && dist3 >= 2 || dist2 >= 2 && dist3 >= 2));

		return check? true : false;
	}
}
	