public class Solution43 {
	public String multiply(String num1, String num2) {
		String out = "";
		String sum = "";
		String temp = "";
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;

		for (int i = num1.length() - 1; i > -1; i--) {
			n1 = Integer.parseInt(num1.substring(i, i + 1));
			temp = "";
			n4 = 0;
			for (int j = num2.length() - 1; j > -1; j--) {
				n2 = Integer.parseInt(num2.substring(j, j + 1));
//				System.out.println("n1=" + n1);
//				System.out.println("n2=" + n2);
				n3 = n1 * n2 + n4;
				if (n3 >= 10) {
					n4 = n3 / 10;
					n3 = n3 % 10;
				} else {
					n4 = 0;
				}
				temp = n3 + temp;
//				System.out.println("n3=" + n3);
//				System.out.println("n4=" + n4);
			}
			if (n4 > 0) {
				temp = n4 + temp;
			}
//			System.out.println("temp=" + temp);
			for (int z = 0; z < num1.length() - 1 - i; z++) {
				temp = temp + "0";
			}
//			System.out.println("temp=" + temp);
			sum = addStrings(temp, sum);
		}
//		System.out.println("sum=" + sum);
		out=sum;
		int len = sum.length();
		for (int i = 0; i < len; i++) {
			if (sum.substring(i, i + 1).equals("0")) {
				out = sum.substring(i);
			} else {
				break;
			}
		}
		return out;
	}

	public String addStrings(String num1, String num2) {
		String out = "";
		int l1 = num1.length();
		int l2 = num2.length();
		if (l1 > l2) {
			for (int i = 0; i < l1 - l2; i++) {
				num2 = "0" + num2;
			}
		}
		if (l2 > l1) {
			for (int i = 0; i < l2 - l1; i++) {
				num1 = "0" + num1;
			}
		}
//		System.out.println(num1);
//		System.out.println(num2);
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		for (int i = num1.length() - 1; i > -1; i--) {
			n1 = Integer.parseInt(num1.substring(i, i + 1));
			n2 = Integer.parseInt(num2.substring(i, i + 1));
			n3 = n1 + n2 + n4;
			if (n3 >= 10) {
				n4 = 1;
				n3 = n3 - 10;
			} else {
				n4 = 0;
			}
			out = n3 + out;
//			System.out.println(n3);
//			System.out.println(n4);
		}
		if (n4 == 1) {
			out = n4 + out;
		}
		return out;
	}

	public static void main(String[] args) {

		Solution43 sol = new Solution43();

		String num1 = "2";
		String num2 = "3";

		System.out.println(sol.multiply(num1, num2));
	}
}
