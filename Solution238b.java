import java.util.Arrays;

public class Solution238b {
	public int[] productExceptSelf(int[] nums) {
		int[] output = new int[nums.length];
		// Arrays.fill(output, 1);
		int res = 1;
		for (int i = 0; i < nums.length; i++) {
			res = res * nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			output[i] = res / nums[i];
		}

		return output;
	}

	public static void main(String[] args) {

		Solution238b sol = new Solution238b();

		int[] nums = { 1, 2, 3, 4 };

		System.out.println(Arrays.toString(sol.productExceptSelf(nums)));
	}
}
