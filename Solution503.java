import java.util.Arrays;

public class Solution503 {

	public int[] nextGreaterElements(int[] nums) {
		int[] out = new int[nums.length];
		boolean b = false;
		for (int i = 0; i < nums.length; i++) {
			out[i] = -1;
			b = false;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] > nums[i]) {
					out[i] = nums[j];
					b = true;
					break;
				}
			}
			if (b == false) {
				for (int j = 0; j < i; j++) {
					if (nums[j] > nums[i]) {
						out[i] = nums[j];
						break;
					}
				}
			}
		}
		return out;
	}

	public static void main(String[] args) {

		Solution503 s = new Solution503();

		int[] nums = { 1, 8, -1, -100, -1, 222, 1111111, -111111 };

		System.out.println(Arrays.toString(s.nextGreaterElements(nums)));
	}
}
