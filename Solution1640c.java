
public class Solution1640c {
	public boolean canFormArray(int[] arr, int[][] pieces) {
		String s1 = helper(arr);
		System.out.println(s1);
		for (int[] piece : pieces) {
			String s2 = helper(piece);
			System.out.println(s2);
			if (!s1.contains(s2)) {
				return false;
			}
		}
		return true;
	}

	private String helper(int[] arr) {
		StringBuilder sb = new StringBuilder();
		for (int x : arr) {
			sb.append(x).append(",");
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		Solution1640c s = new Solution1640c();

		int[] arr = { 91, 4, 64, 78 };
		int[][] pieces = {  { 66 },{ 78 }, { 4, 64 }, { 91 } };

		System.out.println(s.canFormArray(arr, pieces));
	}
}
