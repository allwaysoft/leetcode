import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class Solution300b {
	public int lengthOfLIS(int[] nums) {

		if (nums == null || nums.length == 0) {
			return 0;
		}

		int[] LIS = new int[nums.length];

		Arrays.fill(LIS, 1);

		int max = 1;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (nums[j] < nums[i]) {
					LIS[i] = Math.max(LIS[i], LIS[j] + 1);
				}
			}
			max = Math.max(LIS[i], max);

		}
		return max;
	}

	public static void main(String[] args) {

		Solution300b sol = new Solution300b();

		int[] nums = { 2, 4, 6, 3, 5, 7, 9 };

		System.out.println(sol.lengthOfLIS(nums));
	}
}
