package week26;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1626. 无矛盾的最佳球队
 * @date 2023/3/23 08:31:37
 */
public class Test5 {
    public static void main(String[] args) {

    }
    public int bestTeamScore(int[] scores, int[] ages) {
        int n = scores.length;
        int[][] ints = new int[n][2];
        for (int i = 0; i < n; i++) {
            ints[i][0] = scores[i];
            ints[i][1] = ages[i];
        }
        System.out.println(Arrays.deepToString(ints));
        Arrays.sort(ints,(a,b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        System.out.println(Arrays.deepToString(ints));
        int[] dp = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i -1; j >= 0; j--){
                if (ints[j][1] <= ints[i][1]) {
                    dp[i] = Math.max(dp[i], dp[j]);
                }
            }
            dp[i] += ints[i][0];
            res = Math.max(res, dp[i]);
        }
        System.out.println(Arrays.toString(dp));
        return res;
    }
}
