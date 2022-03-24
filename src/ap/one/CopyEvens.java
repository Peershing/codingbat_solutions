package api.one;

/*
    Given an array of positive ints, return a new array of length "count" containing the first even
    numbers from the original array. The original array will contain at least "count" even numbers.
*/

public class CopyEvens {

    public int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        int index = 0;

        for (int i = 0; index < count; i++) {
            int num = nums[i];
            if (num % 2 == 0) {
                result[index] = num;
                index++;
            }
        }
        return result;
    }
}
