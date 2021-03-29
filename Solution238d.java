import java.util.Arrays;

public class Solution238d {
	public int[] productExceptSelf(int[] nums) {
		int left = 1, right = 1;
		int[] res = new int[nums.length];
		// 第一遍存i 左边所有结点的乘积;
		for (int i = 0; i < nums.length; i++) {
			res[i] = left;
			left *= nums[i];
		}
		// 第二遍倒序，计算当前i右边所有节点的乘积，
		// 调用之前计算的左边的乘积，并替换为左右乘积
		for (int i = nums.length - 1; i >= 0; i--) {
			res[i] *= right;
			right *= nums[i];
		}
		return res;
	}

	public static void main(String[] args) {

		Solution238d sol = new Solution238d();

		int[] nums = { 1, 2, 3, 4 };

		System.out.println(Arrays.toString(sol.productExceptSelf(nums)));
	}
}
