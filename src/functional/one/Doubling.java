package functional.one;

import java.util.List;

/*
	Given a list of integers, return a list where each integer is multiplied by 2.
*/

public class Doubling {
	public List<Integer> doubling(List<Integer> nums) {
		nums.replaceAll(n -> n*2);
		return nums;
		  
		/*
		nums.replaceAll(n -> n*2);
		return nums;
		*/
	}
}
