
public class Solution191b {
	public int hammingWeight(int n) {
		int count = 0;
		for (int i = 0; i < Integer.toBinaryString(n).length(); i++) {
			if (Integer.toBinaryString(n).substring(i, i + 1).equals("1")) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {

		int n = 00000000000000000000000000001011;

		Solution191b s = new Solution191b();

		System.out.println(s.hammingWeight(n));
	}
}
