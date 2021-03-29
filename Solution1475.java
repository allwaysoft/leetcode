
import java.util.Arrays;

public class Solution1475 {

	public int[] finalPrices(int[] prices) {

		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[j] <= prices[i]) {
					prices[i] = prices[i] - prices[j];
					break;
				}
			}

		}
		return prices;
	}

	public static void main(String[] args) {

		Solution1475 sol = new Solution1475();

		int[] prices = { 8, 4, 6, 2, 3 };

		System.out.println(Arrays.toString(sol.finalPrices(prices)));

	}
}
