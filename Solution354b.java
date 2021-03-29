import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution354b {

	public int maxEnvelopes(int[][] envelopes) {
		if (envelopes == null || envelopes.length == 0 || envelopes[0].length == 0) {
			return 0;
		}

		Arrays.sort(envelopes, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if (a[0] != b[0]) {
					return a[0] - b[0];
				} else {
					return b[1] - a[1];
				}
			}
		});

		List<Integer> rights = new ArrayList<Integer>();
		for (int i = 0; i < envelopes.length; i++) {
			if (rights.size() == 0 || rights.get(rights.size() - 1) < envelopes[i][1]) {
				rights.add(envelopes[i][1]);
			} else {
				int begin = 0;
				int end = rights.size() - 1;
				while (begin <= end) {
					int mid = begin + (end - begin) / 2;
					if (rights.get(mid) < envelopes[i][1]) {
						begin = mid + 1;
					} else if (rights.get(mid) > envelopes[i][1]) {
						end = mid - 1;
					} else {
						begin = mid;
						break;
					}
				}
				rights.set(begin, envelopes[i][1]);
			}
		}

		return rights.size();
	}

	public static void main(String[] args) {

		Solution354b s = new Solution354b();

		// int[][] envelopes = { { 5, 4 }, { 6, 4 }, { 6, 7 }, { 2, 3 } };

		int[][] envelopes = { { 2, 100 }, { 3, 200 }, { 4, 300 }, { 5, 500 }, { 5, 400 }, { 5, 250 }, { 6, 370 },
				{ 6, 360 }, { 7, 380 } };

		System.out.println(s.maxEnvelopes(envelopes));
	}
}
