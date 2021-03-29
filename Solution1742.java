import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution1742 {
	public int countBalls(int lowLimit, int highLimit) {
		int[] count = new int[highLimit + 1];
		for (int i = lowLimit; i <= highLimit; i++) {
			int t = i;
			int sum = 0;
			while (t > 0) {
				sum = sum + t % 10;
				t = t / 10;
			}
			count[sum]++;
		}
		// System.out.println(Arrays.toString(count));
		Arrays.sort(count);
		return count[count.length - 1];

	}

	public static void main(String[] args) {

		Solution1742 sol = new Solution1742();

		int lowLimit = 4, highLimit = 7;
		System.out.println(sol.countBalls(lowLimit, highLimit));
	}
}
