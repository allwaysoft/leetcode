
public class Solution1640 {
	public boolean canFormArray(int[] arr, int[][] pieces) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i < pieces.length; i++) {
			for (int j = 0; j < pieces[i].length; j++) {
				System.out.println(pieces[i][j]);
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Solution1640 s = new Solution1640();

		int[] arr = { 91, 4, 64, 78 };
		int[][] pieces = { { 78 }, { 4, 64 }, { 91 } };

		System.out.println(s.canFormArray(arr, pieces));
	}
}
