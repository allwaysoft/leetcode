import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution1403 {
	public List<Integer> minSubsequence(int[] nums) {
		List<Integer> out = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		Arrays.sort(nums);
		int sub = 0;
		for (int i = nums.length - 1; i > -1; i--) {
			out.add(nums[i]);
			sub = sub + nums[i];
			if (sub > sum / 2) {
				break;
			}
		}
		return out;
	}

	public static void main(String[] args) {

		Solution1403 s = new Solution1403();

		int[] nums = { 4, 4, 7, 6, 7 };

		System.out.println(s.minSubsequence(nums));
	}
}
