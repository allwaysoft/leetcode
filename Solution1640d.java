import java.util.HashMap;
import java.util.Map;

public class Solution1640d {
	public boolean canFormArray(int[] arr, int[][] pieces) {
		Map<Integer, Integer> hash = new HashMap<>();
		int[] compare = new int[arr.length];
		int p = 0, q = 0;

		for (int i = 0; i < pieces.length; i++) {
			hash.put(pieces[i][0], i);
		}

		while (p < arr.length) {
			if (!hash.containsKey(arr[p])) {
				return false;
			}

			int index = hash.get(arr[p]);
			for (int i = 0; i < pieces[index].length; i++) {
				compare[q++] = pieces[index][i];
			}
			p += pieces[index].length;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != compare[i]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Solution1640d s = new Solution1640d();

		int[] arr = { 91, 4, 64, 78 };
		int[][] pieces = { { 66 }, { 78 }, { 4, 64 }, { 91 } };

		System.out.println(s.canFormArray(arr, pieces));
	}
}
