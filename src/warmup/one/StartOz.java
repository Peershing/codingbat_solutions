package warmup.one;

/*
	Given a string, return a string made of the first 2 chars (if present), however include first char only if
	it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
*/

public class StartOz {
	public String startOz(String str) {
		  
		if (str.length() >= 2 && str.substring(0, 1).equals("o")
		      && str.substring(1, 2).equals("z")) {
			return "oz";
		}
		if (str.length() >= 1 && str.substring(0, 1).equals("o")) {
			return "o";
		}
		if (str.length() >= 2 && str.substring(1, 2).equals("z")) {
			return "z";
		}
		  
		return "";
	}
}
