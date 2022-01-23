package recursion.one;

/*
	Given a string, compute recursively a new string where all the 'x' chars have been removed.
*/

public class BunnyEars {
	public int bunnyEars(int bunnies) {
		if (bunnies == 0) return 0;
		  
		return 2 + bunnyEars(bunnies-1);
	}
}
