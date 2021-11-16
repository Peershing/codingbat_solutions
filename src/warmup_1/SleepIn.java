package warmup_1;

/*
	The parameter weekday is true if it is a weekday, and the parameter vacation
	is true if we are on vacation. We sleep in if it is not a weekday or we're on
	vacation. Return true if we sleep in.
*/

public class SleepIn {
	public boolean sleepIn(boolean weekday, boolean vacation) {
		if (weekday == true && vacation == false) {
			return false;
		}
		return true;
	}
}
