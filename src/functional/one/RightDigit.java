package functional.one;

import java.util.List;

/*
	Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
*/

public class RightDigit {
	public List<Integer> rightDigit(List<Integer> nums) {
		nums.replaceAll(n -> n%10);
		return nums;
	}
}
