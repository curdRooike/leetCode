package week28;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1039. 多边形三角剖分的最低得分
 * @date 2023/4/2 14:11:34
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().
                minScoreTriangulation(new int[]{3,7,4,5}));
    }
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int[][] dp = new int[n][n];
        for (int i = n - 3; i >= 0; --i) {
            for (int j = i + 2; j < n; ++j){
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; ++k){
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j] +
                            values[i] * values[j] * values[k]);
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[0][n - 1];
    }
}
