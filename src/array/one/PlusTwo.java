package array.one;

/*
	Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
*/

public class PlusTwo {
	public int[] plusTwo(int[] a, int[] b) {
		int[] result = new int[4];
		int resultIndex = 0;
		for (int i : a) {
			result[resultIndex] = i;
		    resultIndex++;
		}
		for (int i : b) {
			result[resultIndex] = i;
		    resultIndex++;
		}
		  
		return result;
	}
}
