package DP;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 不同路径2
 * @date 2023/3/29 18:42:59
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().uniquePathsWithObstacles(new int[][]{{0, 0, 0}
                , {0, 1, 0}, {0, 0, 0}}));
    }
    /*public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        if (obstacleGrid[m - 1][n - 1] == 1 || obstacleGrid[0][0] == 1) {
            return 0;
        }
        for (int i = 0; i < m && obstacleGrid[i][0] == 0; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n && obstacleGrid[0][j] == 0; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = (obstacleGrid[i][j] == 0) ? dp[i][j - 1] + dp[i - 1][j] : 0;
            }
        }
        return dp[n - 1][m - 1];
    }*/
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[n];

        for (int j = 0; j < n && obstacleGrid[0][j] == 0; j++) {
            dp[j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[j] = 0;
                } else if (j != 0) {
                    dp[j] += dp[j - 1];
                }
            }
        }
        return dp[n - 1];
    }

}
