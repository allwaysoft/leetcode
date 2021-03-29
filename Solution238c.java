import java.util.Arrays;

public class Solution238c {
	public int[] productExceptSelf(int[] nums) {
		if (nums == null || nums.length == 0) {
			return new int[0];
		}

		int len = nums.length;
		int[] res = new int[len];

		int left = 1;
		for (int i = 0; i < len; i++) {
			// 防止越界
			if (i > 0) {
				left = left * nums[i - 1];
			}
			res[i] = left;
		}

		int right = 1;
		for (int i = len - 1; i >= 0; i--) {
			// 防止越界
			if (i < len - 1) {
				right = right * nums[i + 1];
			}
			res[i] *= right;
		}
		return res;
	}

	public static void main(String[] args) {

		Solution238c sol = new Solution238c();

		int[] nums = { 1, 2, 3, 4 };

		System.out.println(Arrays.toString(sol.productExceptSelf(nums)));
	}
}
