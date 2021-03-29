import java.util.Arrays;

public class Solution238 {
	public int[] productExceptSelf(int[] nums) {
		int[] output = new int[nums.length];
		Arrays.fill(output, 1);

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (j != i) {
					output[i] = output[i] * nums[j];
				}
			}

		}

		return output;
	}

	public static void main(String[] args) {

		Solution238 sol = new Solution238();

		int[] nums = { 1, 2, 3, 4 };

		System.out.println(Arrays.toString(sol.productExceptSelf(nums)));
	}
}
