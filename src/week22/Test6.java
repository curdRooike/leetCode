package week22;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1140. 石子游戏 II(代做)
 * @date 2023/2/22 03:23:56
 */
public class Test6 {
    public static void main(String[] args) {
        int []a = {2,7,9,4,4};
        System.out.println(new Test6().stoneGameII(a));
    }
    public int stoneGameII(int[] piles) {
        int len = piles.length, sum = 0;
        int[][] dp = new int[len][len + 1];
        for (int i = len - 1; i >= 0; i--) {
            sum += piles[i];
            for (int M = 1; M <= len; M++) {
                if (i + 2 * M >= len) {
                    dp[i][M] = sum;
                } else {
                    for (int x = 1; x <= 2 * M; x++) {
                        dp[i][M] = Math.max(dp[i][M], sum - dp[i + x][Math.max(M, x)]);
                    }
                }
            }
        }
        return dp[0][1];
    }
}
