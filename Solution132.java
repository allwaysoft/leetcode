import java.util.ArrayList;
import java.util.List;

public class Solution132 {

	public int minCut(String s) {
		List<List<String>> out = new ArrayList<List<String>>();
		int min=0;
		String sub = "";
		for (int i = 0; i < s.length(); i++) {
			sub = "";
			for (int j = 0; j < s.length() - i; j++) {
				sub = s.substring(j, j + i + 1);
				if (isPalindrome(sub)) {
					System.out.println(sub);
				}

			}

		}

		return min;

	}

	static boolean isPalindrome(String str) {
		int low;
		int high;
		low = 0;
		high = str.length() - 1;

		while (low < high) {
			if (str.charAt(low) != str.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}

	public static void main(String[] args) {

		Solution132 sol = new Solution132();

		String s = "aabaabaabaab";
		System.out.println(sol.minCut(s));
	}
}
