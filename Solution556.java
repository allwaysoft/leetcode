import java.util.Arrays;

public class Solution556 {

	public int nextGreaterElement(int n) {
		int out = -1;
		char temp = '0';
		String s = String.valueOf(n);
		char[] a = s.toCharArray();
		l: for (int i = a.length - 1; i > -1; i--) {
			for (int j = a.length - 1; j > i; j--) {
				if (a[j] > a[i]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					Arrays.sort(a, i + 1, a.length);
					break l;
				}
			}
		}
		// System.out.println(Arrays.toString(a));
		String str = new String(a);

		// System.out.println(str);
		Long l = Long.parseLong(str);
		if (l > Integer.MAX_VALUE) {
			out = -1;
		} else {
			if (Integer.parseInt(str) > n) {
				out = Integer.parseInt(str);
			}
		}

		return out;
	}

	public static void main(String[] args) {

		Solution556 sol = new Solution556();

		int n = 230241;

		System.out.println(sol.nextGreaterElement(n));
	}
}
