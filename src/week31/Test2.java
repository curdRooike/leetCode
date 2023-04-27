package week31;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1027. 最长等差数列
 * @date 2023/4/26 20:25:44
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().longestArithSeqLength(new int[]{3, 6, 9, 12}));
    }
    public int longestArithSeqLength(int[] nums) {
        int ans = 0, n = nums.length;
        int[][] dp = new int[n][1001];
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; --j) {
                int d = nums[i] - nums[j];
                if (dp[i][d] == 0){
                    dp[i][d] = dp[j][d] + 1;
                    ans = Math.max(ans, dp[i][d]);
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return ans + 1;
    }
}
