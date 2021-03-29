
public class Solution1640b {
	public boolean canFormArray(int[] arr, int[][] pieces) {
		int[] map = new int[101];
		for (int i = 0; i < arr.length; i++) {
			map[arr[i]] = i + 1;
		}
		for (int i = 0; i < pieces.length; i++) {
			if (map[pieces[i][0]] == 0)
				return false;
			for (int j = 1; j < pieces[i].length; j++) {

				if (map[pieces[i][j]] == 0 || map[pieces[i][j]] - map[pieces[i][j - 1]] != 1)
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Solution1640b s = new Solution1640b();

		int[] arr = { 91, 4, 64, 78 };
		int[][] pieces = { { 66 }, { 78 }, { 4, 64 }, { 91 } };
		;

		System.out.println(s.canFormArray(arr, pieces));
	}
}
