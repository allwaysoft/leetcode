
public class CartesianProductDemo {

	public static void main(String[] args) {
		String[] A = new String[] { "a1", "a2", "a3" };
		String[] B = new String[] { "b1", "b2", "b3" };
		String[] C = new String[] { "c1" };

		String[] cp = CartesianProduct(0, A, B, C);

		for (String s : cp) {
			System.out.println(s);
		}
	}

	public static String[] CartesianProduct(int prodLevel, String[] res, String[]... s) {
		if (prodLevel < s.length) {
			int cProdLen = res.length * s[prodLevel].length;
			String[] tmpRes = new String[cProdLen];

			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < s[prodLevel].length; j++) {
					tmpRes[i * res.length + j] = res[i] + s[prodLevel][j];
				}
			}
			res = CartesianProduct(prodLevel + 1, tmpRes, s);
		}
		return res;
	}
}