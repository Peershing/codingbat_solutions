package array.one;

/*
	Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
	If either array is length 0, ignore that array.
*/

public class Front11 {
	public int[] front11(int[] a, int[] b) {
		int size = 0;
		boolean isAEmpty = (a.length == 0);
		boolean isBEmpty = (b.length == 0);
		if (!isAEmpty) {
			size++;
		}
		if (!isBEmpty) {
			size++;
		}
		  
		int[] result = new int[size];
		int index = 0;
		if (!isAEmpty) {
			result[index] = a[0];
		    index++;
		}
		if (!isBEmpty) {
		    result[index] = b[0];
		    index++;
		}
		  
		return result;
	}
}
