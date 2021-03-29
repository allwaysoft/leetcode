
import java.util.ArrayList;
import java.util.List;

public class Solution830 {
	public List<List<Integer>> largeGroupPositions(String s) {
		List<List<Integer>> out = new ArrayList<List<Integer>>();
		if (s.length() < 3) {
			return out;
		}
		s = s + "1";
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			int diff = s.charAt(i) - s.charAt(i - 1);
			if (diff == 0) {
				count++;

			} else {
				if (count >= 3) {
					ArrayList<Integer> item = new ArrayList<Integer>();
					item.add(i - count);
					item.add(i - 1);
					out.add(item);
				}
				count = 1;
			}

		}
		return out;
	}

	public static void main(String[] args) {

		Solution830 sol = new Solution830();
		String s = "aaa";

		System.out.println(sol.largeGroupPositions(s));
	}
}
