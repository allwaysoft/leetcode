import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution784c {
	public List<String> letterCasePermutation(String S) {
		List<List<String>> wl = new ArrayList<List<String>>();
		//S = S.toLowerCase();
		for (int i = 0; i < S.length(); i++) {
			if (Character.isLetter(S.charAt(i))) {
				List<String> temp = Arrays.asList(S.substring(i, i + 1).toLowerCase(),
						S.substring(i, i + 1).toUpperCase());
				wl.add(temp);
			} else {
				List<String> temp = Arrays.asList(S.substring(i, i + 1));
				wl.add(temp);
			}

		}
		List<String> descartesList = cartesianProduct(wl);
		return descartesList;
	}

	public static List<String> cartesianProduct(List<List<String>> wordLists) {
		List<String> cp = wordLists.get(0);
		for (int i = 1; i < wordLists.size(); i++) {
			List<String> secondList = wordLists.get(i);
			List<String> combinedList = cp.stream().flatMap(s1 -> secondList.stream().map(s2 -> s1 + s2))
					.collect(Collectors.toList());
			cp = combinedList;
		}
		return cp;
	}

	public static void main(String[] args) {

		Solution784c sol = new Solution784c();

		String S = "mQe";

		System.out.println(sol.letterCasePermutation(S));
	}
}
