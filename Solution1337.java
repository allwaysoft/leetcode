import java.util.Arrays;

public class Solution1337 {
	public int[] kWeakestRows(int[][] mat, int k) {
		int[] out = new int[k];
		int[] sum = new int[mat.length];
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			count = 0;
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == 1) {
					count++;
				}
			}
			sum[i] = count;
		}
		// System.out.println(Arrays.toString(sum));
		int[] sort = sum.clone();
		Arrays.sort(sort);
		// System.out.println(Arrays.toString(sort));
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < sum.length; j++) {
				if (sort[i] == sum[j]) {
					sum[j] = -1;
					out[i] = j;
					break;
				}
			}
		}
		return out;
	}

	public static void main(String[] args) {

		Solution1337 sol = new Solution1337();

		int[][] mat = { { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 1 } };
		int k = 3;
		System.out.println(Arrays.toString(sol.kWeakestRows(mat, k)));
	}
}
