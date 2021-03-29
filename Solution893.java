import java.util.Arrays;
import java.util.HashSet;

public class Solution893 {

	public int numSpecialEquivGroups(String[] A) {
		HashSet<String> dedup = new HashSet<String>();

		String oddstr = "";
		String evenstr = "";

		for (int i = 0; i < A.length; i++) {
			oddstr = "";
			evenstr = "";
			for (int j = 0; j < A[i].length(); j++) {
				if (j % 2 == 1) {
					oddstr = oddstr + A[i].subSequence(j, j + 1);
				} else {
					evenstr = evenstr + A[i].subSequence(j, j + 1);
				}
			}
			char[] oddcharArray = oddstr.toCharArray();
			Arrays.sort(oddcharArray);

			char[] evencharArray = evenstr.toCharArray();
			Arrays.sort(evencharArray);
			// System.out.println(String.valueOf(oddcharArray) +
			// String.valueOf(evencharArray));
			dedup.add(String.valueOf(oddcharArray) + String.valueOf(evencharArray));
		}

		return dedup.size();

	}

	public static void main(String[] args) {

		Solution893 sol = new Solution893();

		String[] A = { "abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx" };

		System.out.println(sol.numSpecialEquivGroups(A));
	}
}
