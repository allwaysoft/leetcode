import java.util.*;

class Longestsubseq {
	static int numOfIncSubseq(int[] a, int n) {

		int[] len = new int[n];
		int[] cnt = new int[n];

		for (int i = 0; i < n; i++) {
			len[i] = 1;
			cnt[i] = 1;
		}

		int lis = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (a[i] > a[j]) {

					if (len[j] + 1 > len[i]) {
						len[i] = len[j] + 1;
						cnt[i] = cnt[j];
					}

					else if (len[j] + 1 == len[i]) {
						cnt[i] += cnt[j];
					}
				}

				lis = Math.max(lis, len[i]);
			}
		}

		int ans = 0;

		for (int i = 0; i < n; i++) {
			if (len[i] == lis)
				ans += cnt[i];
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 4, 7 };
		int n = a.length;

		System.out.println(numOfIncSubseq(a, n));
	}
}