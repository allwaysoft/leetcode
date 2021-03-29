import java.util.Arrays;

public class Solution1758 {

	public int minOperations(String s) {
		int min1 = 0, min2 = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != (i % 2) + '0') {// 010101010
				min1++;
			}
			if (s.charAt(i) != ((i + 1) % 2) + '0') {// 10101010
				min2++;
			}
		}
		return Math.min(min1, min2);
	}

	public static void main(String[] args) {

		Solution1758 sol = new Solution1758();
		String s = "1111";
		System.out.println(sol.minOperations(s));
	}
}
