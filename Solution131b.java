import java.util.ArrayList;
import java.util.List;

public class Solution131b {

	public List<List<String>> partition(String s) {
		List<List<String>> out = new ArrayList<List<String>>();
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

		return out;

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

		Solution131b sol = new Solution131b();

		String s = "aabaabaabaab";
		System.out.println(sol.partition(s));
	}
}
