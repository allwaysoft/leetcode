import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution46 {
	public List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> list = new ArrayList<>();
		permuteHelper(list, new ArrayList<>(), nums);
		return list;
	}

	private void permuteHelper(List<List<Integer>> list, List<Integer> resultList, int[] arr) {

		// Base case
		if (resultList.size() == arr.length) {
			list.add(new ArrayList<>(resultList));
		} else {
			for (int i = 0; i < arr.length; i++) {

				if (resultList.contains(arr[i])) {
					// If element already exists in the list then skip
					continue;
				}
				// Choose element
				resultList.add(arr[i]);
				// Explore
				permuteHelper(list, resultList, arr);
				// Unchoose element
				resultList.remove(resultList.size() - 1);
			}
		}
	}

	public static void main(String[] args) {

		Solution46 sol = new Solution46();

		int[] nums = { 1, 2, 3 };

		System.out.println(sol.permute(nums));
	}
}
