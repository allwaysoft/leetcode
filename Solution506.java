import java.util.Arrays;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution506 {
	public String[] findRelativeRanks(int[] score) {
		String[] out = new String[score.length];
		int[] sort = score.clone();

		Arrays.sort(sort);
		for (int i = 0; i < sort.length; i++) {
			for (int j = 0; j < score.length; j++) {
				if (score[j] == sort[sort.length - 1 - i]) {
					if (i == 0) {
						out[j] = "Gold Medal";
					} else if (i == 1) {
						out[j] = "Silver Medal";
					} else if (i == 2) {
						out[j] = "Bronze Medal";
					} else {
						out[j] = String.valueOf(i + 1);
					}

				}
			}

		}
		return out;

	}

	public static void main(String[] args) {

		Solution506 s = new Solution506();

		int[] score = { 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(s.findRelativeRanks(score)));
	}
}
