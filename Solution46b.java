import java.util.ArrayList;
import java.util.List;

public class Solution46b {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Permutation(0, nums, result);
		return result;
	}

	private void Permutation(int i, int[] nums, List<List<Integer>> result) {
		if (i == nums.length - 1) {
			List<Integer> list = new ArrayList<>();
			for (int n : nums)
				list.add(n);
			result.add(list);
		} else {
			for (int j = i, l = nums.length; j < l; j++) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				Permutation(i + 1, nums, result);
				temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
			}
		}
	}

	public static void main(String[] args) {

		Solution46b sol = new Solution46b();

		int[] nums = { 1, 2, 3 };

		System.out.println(sol.permute(nums));
	}
}
