package week27;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1143. 最长公共子序列
 * @date 2023/3/27 14:52:11
 */
public class Test3_1 {
    public static void main(String[] args) {
        System.out.println(new Test3_1().longestCommonSubsequence("ab", "ac"));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            char c1 = text1.charAt(i - 1);
            for (int j = 1; j <= n; j++) {
                char c2 = text2.charAt(j - 1);
                if (c1 == c2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        //System.out.println(Arrays.deepToString(dp));
        return dp[m][n];
    }
}
