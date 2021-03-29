import java.util.Arrays;

public class Solution1652 {
	public int[] decrypt(int[] code, int k) {
		int len=code.length;
		int [] out=new int[code.length];
		for (int i=0;i<len-k;i++) {
			if (k>0) {
			out[i]=code[]
			}
		}


		return out;

	}

	public static void main(String[] args) {

		Solution1652 sol = new Solution1652();

		int[] code = {5,7,1,4};
		int k = 3;

		System.out.println(sol.decrypt(code,  k));
	}
}
