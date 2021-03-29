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
            // ע��ż���������������Ȼ��Ĵ����ص�
            mincutHelper(s , i , i , dp);  // �������Ĵ���1���ַ�Ϊ����
            mincutHelper(s, i , i+1 , dp); // ż�����Ĵ���2���ַ�Ϊ����
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
