import java.util.Arrays;

public class Solution1502 {
	public boolean canMakeArithmeticProgression(int[] arr) {
		if (arr.length < 3) {
			return true;
		}
		Arrays.sort(arr);
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] - arr[i - 1] != arr[1] - arr[0]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Solution1502 s = new Solution1502();

		int[] arr = { 1, 2, 4 };

		System.out.println(s.canMakeArithmeticProgression(arr));
	}
}
