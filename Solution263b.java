
public class Solution263b {
	public boolean isUgly(int num) {
		if (num == 0) {
			return false;
		}
		if (num == 1) {
			return true;
		}
		while (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
			if (num % 2 == 0) {
				num = num / 2;
			}
			if (num % 3 == 0) {
				num = num / 3;
			}
			if (num % 5 == 0) {
				num = num / 5;
			}
		}
		if (num == 1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Solution263b s = new Solution263b();
		int num = -2147483648;

		System.out.println(s.isUgly(num));
	}
}
