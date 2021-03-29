
public class Solution191 {
	public int hammingWeight(int n) {

		return Integer.bitCount(n);

	}

	public static void main(String[] args) {

		int n = 00000000000000000000000000001011;

		Solution191 s = new Solution191();

		System.out.println(s.hammingWeight(n));
	}
}
