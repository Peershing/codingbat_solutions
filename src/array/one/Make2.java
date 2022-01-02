package array.one;

/*
	Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a
	followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements
	available between the 2 arrays.
*/

public class Make2 {
	public int[] make2(int[] a, int[] b) {
		int[] result = new int[2];
		int resultIndex = 0;
		  
		for (int i : a) {
			if (resultIndex < 2) {
				result[resultIndex] = i;  
				resultIndex++;
		    }
		}
		for (int i : b) {
		    if (resultIndex < 2) {
		    	result[resultIndex] = i;  
		    	resultIndex++;
		    }
		}
		  
		return result;
	}
}
