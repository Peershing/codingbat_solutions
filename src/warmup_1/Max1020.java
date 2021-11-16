package warmup_1;

/*
	Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return
	0 if neither is in that range.
*/

public class Max1020 {
	public int max1020(int a, int b) {
		boolean aInRange = (a >= 10 && a <= 20);
		boolean bInRange = (b >= 10 && b <= 20);
		  
		if (aInRange && bInRange) {
			if (a > b) {
				return a;
		    }
		    return b;
		}
		if (aInRange && !bInRange) {
			return a;
		}
		if (!aInRange && bInRange) {
			return b;
		}
		  
		return 0;
	}
}
