import java.util.Arrays;

public class Solution1608 {

	public int specialArray(int[] nums) {
		Arrays.sort(nums);
		if (nums[0] >= nums.length)// length¸öÖµ
			return nums.length;
		for (int i = 1; i <= nums.length; i++) {
			if ((nums[nums.length - i] >= i && nums[nums.length - i - 1] < i))
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {

		Solution1608 sol = new Solution1608();
		int[] nums = { 3, 6, 7, 7, 0 };
		System.out.println(sol.specialArray(nums));
	}
}
