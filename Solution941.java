import java.util.Arrays;

public class Solution941 {
	public int[] diStringMatch(String S) {
		int[] out = new int[S.length() + 1];
		int temp = 0;

		for (int i = 0; i < out.length; i++) {
			out[i] = i;
		}
		// System.out.println(Arrays.toString(out));
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'I') {
				Arrays.sort(out, i, out.length);
				// System.out.println(Arrays.toString(out));

			}
			if (S.charAt(i) == 'D') {

				temp = out[i];
				out[i] = out[out.length - 1];
				out[out.length - 1] = temp;
				// System.out.println(Arrays.toString(out));
				Arrays.sort(out, i + 1, out.length);

			}

		}

		return out;
	}

	public static void main(String[] args) {

		Solution941 sol = new Solution941();

		String S = "III";
		// [0,4,1,3,2]

		System.out.println(Arrays.toString(sol.diStringMatch(S)));
	}
}
