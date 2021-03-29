import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class Solution354 {
	public int maxEnvelopes(int[][] envelopes) {
		int[] w = new int[envelopes.length];
		for (int i = 0; i < envelopes.length; i++) {
			w[i] = envelopes[i][0] ;
		}
		Arrays.sort(w);
		System.out.println(Arrays.toString(w));
		
		int[] h = new int[envelopes.length];
		for (int i = 0; i < envelopes.length; i++) {
			h[i] = envelopes[i][1] ;
		}
		Arrays.sort(h);
		System.out.println(Arrays.toString(h));
		
		int a = 0;
		int b = 0;
		int count = 0;
		for (int i = 0; i < w.length; i++) {
			for (int j = 0; j < envelopes.length; j++) {

				if ((envelopes[j][0] == w[i]) && (envelopes[j][0] > a) && (envelopes[j][1] > b)) {
					count++;
					a = envelopes[j][0];
					b = envelopes[j][1];

				}
			}
		}

		return count;
	}

	public static void main(String[] args) {

		Solution354 s = new Solution354();

		//int[][] envelopes = { { 5, 4 }, { 6, 4 }, { 6, 7 }, { 2, 3 } };
		
		int[][] envelopes = {{2,100},{3,200},{4,300},{5,500},{5,400},{5,250},{6,370},{6,360},{7,380}};

		System.out.println(s.maxEnvelopes(envelopes));
	}
}
