package string.three;

/*
	Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
	A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char
	is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
*/

public class SumNumbers {
	public int sumNumbers(String str) {
		int len = str.length();
		String temp = "";
		int sum = 0;
		  
		for (int i = 0; i < len; i++) {
			if (Character.isDigit(str.charAt(i))) {
				if (i < len-1 && Character.isDigit(str.charAt(i+1))) {
					temp += str.charAt(i);
				}
				else {
					temp += str.charAt(i);
					sum += Integer.parseInt(temp);
					temp = "";
				}
		    }
		}
		  
		return sum;
	}
}
