
public class Solution1512 {
	public int numSub(String s) {
		String[] split = s.split("0");
		int res = 0;
		int mod = (int) (Math.pow(10, 9) + 7);
		for (String s1 : split) {
			long len = s1.length();
			if (len > 0) {
				long n = (((1 + len) * len) % mod) / 2;
				res = (res + ((int) n % mod)) % mod;
			}
		}
		return res % mod;
	}

	public static void main(String[] args) {

		Solution1512 sol = new Solution1512();
		String s = "0110111";

		System.out.println(sol.numSub(s));
	}
}
