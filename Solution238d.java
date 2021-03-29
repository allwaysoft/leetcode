import java.util.Arrays;

public class Solution238d {
	public int[] productExceptSelf(int[] nums) {
		int left = 1, right = 1;
		int[] res = new int[nums.length];
		// ��һ���i ������н��ĳ˻�;
		for (int i = 0; i < nums.length; i++) {
			res[i] = left;
			left *= nums[i];
		}
		// �ڶ��鵹�򣬼��㵱ǰi�ұ����нڵ�ĳ˻���
		// ����֮ǰ�������ߵĳ˻������滻Ϊ���ҳ˻�
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
