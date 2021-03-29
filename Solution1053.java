import java.util.Arrays;

public class Solution1053 {
	public int[] prevPermOpt1(int[] A) {
		int len = A.length;
		int index = -1;
		for (int i = len - 1; i > 0; i--) {
			if (A[i - 1] > A[i]) {
				index = i - 1;
				break;
			}
		}
		if (index == -1) {
			return A;
		}
		int in = A[index];
		int ans = A[index + 1];
		int result = index + 1;
		for (int j = index + 1; j < A.length; j++) {
			if (A[j] < in && A[j] > ans) {
				ans = A[j];
				result = j;
			}
		}
		A[index] = ans;
		A[result] = in;
		return A;
	}

	public static void main(String[] args) {

		Solution1053 sol = new Solution1053();

		int[] arr = { 3, 2, 1 };

		System.out.println(Arrays.toString(sol.prevPermOpt1(arr)));
	}
}
