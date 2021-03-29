
import java.util.HashMap;
import java.util.Map.Entry;

public class Solution1399 {
	public int countLargestGroup(int n) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int m = 0;
		int t = 0;
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			t = i;
			sum = 0;
			while (t > 0) {
				m = t % 10;
				t = t / 10;
				// System.out.println("i=" + i + ":m=" + m);
				sum = sum + m;

			}
			// System.out.println("i=" + i + ":sum=" + sum);
			if (hm.containsKey(sum)) {
				hm.put(sum, hm.get(sum) + 1);
			} else {
				hm.put(sum, 1);
			}

		}
		// System.out.println(hm);
		int max = 0;
		for (Entry<Integer, Integer> set : hm.entrySet()) {
			if (set.getValue() > max) {
				max = set.getValue();
			}
		}
		// System.out.println("max=" + max);
		int count = 0;
		for (Entry<Integer, Integer> set : hm.entrySet()) {
			if (set.getValue() == max) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		Solution1399 sol = new Solution1399();

		int n = 13;

		System.out.println(sol.countLargestGroup(n));
	}
}
