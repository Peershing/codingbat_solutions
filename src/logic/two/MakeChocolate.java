package logic.two;

/*
	We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and
	big bars (5 kilos each). Return the number of small bars to use, assuming we always use
	big bars before small bars. Return -1 if it can't be done.
*/

public class MakeChocolate {
	public int makeChocolate(int small, int big, int goal) {
		if (goal >= 5) {
			if(goal/5 >= big) {
				goal-= big * 5;
		    }
		    else { 
		    	goal = goal % 5;
		    }
		}
		if (goal <= small) {
			return goal;
		}
		  
		return -1;
	}
}
