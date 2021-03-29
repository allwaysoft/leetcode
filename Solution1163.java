import java.util.Iterator;
import java.util.TreeSet;

public class Solution1163 {
	public String lastSubstring(String s) {
		TreeSet<String> ts = new TreeSet<String>();
		String out = "";
		String sub = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length() - i; j++) {
				sub = s.substring(j, j + i + 1);
				// System.out.println(sub);
				ts.add(sub);

			}
		}
		Iterator<String> it = ts.descendingIterator();
		while (it.hasNext()) {
			out = it.next();
			break;
		}

		return out;
	}

	public static void main(String[] args) {

		Solution1163 sol = new Solution1163();
		String s = "abab";

		System.out.println(sol.lastSubstring(s));
	}
}
