package week24;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 剑指 Offer 47. 礼物的最大价值
 * @date 2023/3/9 08:43:44
 */
public class Test6 {
    public int maxValue(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        //dp[i][j]表示从grid[0][0]到grid[i - 1][j - 1]时的最大价值
        int[][] dp = new int[row + 1][column + 1];
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i - 1][j - 1];
            }
        }
        return dp[row][column];
    }
}
