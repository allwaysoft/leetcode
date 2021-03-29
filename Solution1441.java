import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1441 {

	public List<String> buildArray(int[] target, int n) {
		List<String> out = new ArrayList<String>();
		int[] count = new int[n + 1];
		for (int i = 0; i < target.length; i++) {
			count[target[i]]++;
		}
		for (int i = 1; i <= target[target.length - 1]; i++) {
			if (count[i] == -1) {
				break;
			} else {
				if (count[i] == 1) {
					out.add("Push");
				} else {
					out.add("Push");
					out.add("Pop");
				}
			}
		}
		return out;
	}

	public static void main(String[] args) {

		Solution1441 sol = new Solution1441();

		int[] target = { 1, 3 };
		int n = 3;
		System.out.println(sol.buildArray(target, n));
	}
}
