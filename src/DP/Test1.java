package DP;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 62. 不同路径
 * @date 2023/3/29 18:24:00
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().uniquePaths(3, 7));
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        //System.out.println(Arrays.deepToString(dp));
        return dp[m - 1][n - 1];
    }
}
