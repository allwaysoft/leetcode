import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution132b {

    public int minCut(String s) {
        if(s == null || s.length() <= 1)
            return 0;
        int len = s.length();
        int dp[] = new int[len];
		Arrays.fill(dp, len-1);
        for(int i = 0; i < len; i++){
            // 注意偶数长度与奇数长度回文串的特点
            mincutHelper(s , i , i , dp);  // 奇数回文串以1个字符为中心
            mincutHelper(s, i , i+1 , dp); // 偶数回文串以2个字符为中心
        }
        return dp[len-1];
    }
    private void mincutHelper(String s, int i, int j, int[] dp){
        int len = s.length();
        while(i >= 0 && j < len && s.charAt(i) == s.charAt(j)){
            dp[j] = Math.min(dp[j] , (i==0?-1:dp[i-1])+1);
            i--;
            j++;
        }
    }



	public static void main(String[] args) {

		Solution132b sol = new Solution132b();

		String s = "aabaabaabaab";
		System.out.println(sol.minCut(s));
	}
}
