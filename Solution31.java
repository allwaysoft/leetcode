import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution31 {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		permuteHelper(list, new ArrayList<>(), nums, new boolean[nums.length]);

		return list;
	}

	private void permuteHelper(List<List<Integer>> list, List<Integer> resultList, int[] arr, boolean[] used) {

		// Base case
		if (resultList.size() == arr.length) {
			list.add(new ArrayList<>(resultList));
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (used[i] || i > 0 && arr[i] == arr[i - 1] && !used[i - 1]) {
					// If element is already used
					continue;
				}
				// choose element
				used[i] = true;
				resultList.add(arr[i]);

				// Explore
				permuteHelper(list, resultList, arr, used);

				// Unchoose element
				used[i] = false;
				resultList.remove(resultList.size() - 1);
			}
		}
	}

	public static void main(String[] args) {

		Solution31 sol = new Solution31();

		int[] nums = { 1, 2, 3 };

		System.out.println(sol.permuteUnique(nums));
	}
}
