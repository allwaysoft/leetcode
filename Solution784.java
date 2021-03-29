import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;

public class Solution784 {
	public List<String> letterCasePermutation(String S) {
		List<StringBuilder> ans = new ArrayList();
		ans.add(new StringBuilder());

		for (char c : S.toCharArray()) {
			int n = ans.size();
			if (Character.isLetter(c)) {
				for (int i = 0; i < n; ++i) {
					ans.add(new StringBuilder(ans.get(i)));
					ans.get(i).append(Character.toLowerCase(c));
					ans.get(n + i).append(Character.toUpperCase(c));
				}
			} else {
				for (int i = 0; i < n; ++i)
					ans.get(i).append(c);
			}
		}

		List<String> finalans = new ArrayList();
		for (StringBuilder sb : ans)
			finalans.add(sb.toString());
		return finalans;
	}

	public static void main(String[] args) {

		Solution784 sol = new Solution784();

		String S = "mQe";

		System.out.println(sol.letterCasePermutation(S));
	}
}
