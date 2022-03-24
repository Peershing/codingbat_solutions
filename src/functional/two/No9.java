package functional.two;

import java.util.List;

/*
	Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9.
	(Note: % by 10)
*/

public class No9 {
	public List<Integer> no9(List<Integer> nums) {
		nums.removeIf(n -> n%10==9);
		return nums;
	}
}
