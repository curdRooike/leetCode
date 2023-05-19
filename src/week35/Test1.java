package week35;

import util.SoutUtil;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1335. 工作计划的最低难度
 * @date 2023/5/16 00:53:02
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().minDifficulty(new int[]{6, 5, 4, 3, 2, 1}, 2));
    }
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        if(n < d)
            return -1;
        int[] dp = new int[n];
        dp[0] = jobDifficulty[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], jobDifficulty[i]);
        }
        for (int i = 1; i < d; i++) {
            for (int j = n - 1; j >= i; j--) {
                dp[j] = Integer.MAX_VALUE;
                int mx = 0;
                for (int k = j; k >= i; k--) {
                    mx = Math.max(mx, jobDifficulty[k]);
                    dp[j] = Math.min(dp[j], dp[k - 1] + mx);
                }
            }
        }
        //SoutUtil.ArrayOut(dp);
        return dp[n - 1];
    }
}
