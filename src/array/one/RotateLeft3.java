package array.one;

/*
	Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields
	{2, 3, 1}.
*/

public class RotateLeft3 {
	public int[] rotateLeft3(int[] nums) {
		int[] rotated = nums;
		rotated[0] = rotated[0] ^ rotated[2] ^ (rotated[2] = rotated[0]);
		rotated[1] = rotated[1] ^ rotated[0] ^ (rotated[0] = rotated[1]);
		return rotated;
	}
}
