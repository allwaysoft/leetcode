
import java.util.Arrays;

public class Solution868 {
	public int binaryGap(int n) {
		String b = Integer.toBinaryString(n);
		int left = -1;
		int out = 0;
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == '1') {
				if (left == -1) {
					left = i;
				} else {
					if ((i - left) > out) {
						out = i - left;
					}
					left = i;
				}
			}
		}

		return out;

	}

	public static void main(String[] args) {

		Solution868 s = new Solution868();
		int n = 22;

		System.out.println(s.binaryGap(n));
	}
}
