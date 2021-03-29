import java.util.Arrays;

public class Solution338 {
	public int[] countBits(int num) {
		int[] out = new int[num + 1];
		for (int i = 0; i <= num; i++) {
			out[i] = Integer.bitCount(i);
		}

		return out;
	}

	public static void main(String[] args) {

		Solution338 sol = new Solution338();

		int num = 5;

		System.out.println(Arrays.toString(sol.countBits(num)));
	}
}
