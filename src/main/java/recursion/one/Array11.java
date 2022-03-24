package recursion.one;

/*
    Given an array of ints, compute recursively the number of times that the value 11 appears
    in the array. We'll use the convention of considering only the part of the array that begins
    at the given index. In this way, a recursive call can pass index+1 to move down the array.
    The initial call will pass in index as 0.
*/

public class Array11 {
    public int array11(int[] nums, int index) {
        if (nums.length == 0 || index >= nums.length) return 0;
        else if (index <= nums.length-1 && nums[index] == 11) return 1 + array11(nums, index+1);
        return array11(nums, index+1);
    }
}
