
public class Solution1582 {

	public int numSpecial(int[][] mat) {
		int[] rowsum = new int[mat.length];
		int[] colsum = new int[mat[0].length];
		int num = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				rowsum[i] = rowsum[i] + mat[i][j];
				colsum[j] = colsum[j] + mat[i][j];
			}
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == 1 && rowsum[i] == 1 && colsum[j] == 1) {
					num++;
				}
			}
		}

//		System.out.println(Arrays.toString(rowsum));
//		System.out.println(Arrays.toString(colsum));
		return num;
	}

	public static void main(String[] args) {

		Solution1582 s = new Solution1582();

		// int[][] mat = { { 1, 0, 0 }, { 0, 0, 1 }, { 1, 0, 0 } };

		int[][] mat = { { 0, 0 }, { 0, 0 }, { 1, 0 } };
		System.out.println(s.numSpecial(mat));
	}
}
