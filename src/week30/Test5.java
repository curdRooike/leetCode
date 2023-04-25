package week30;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 300. 最长递增子序列
 * @date 2023/4/20 01:26:13
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println(new Test5().lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i;j++){
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int res = 0;
        for (int i : dp) {
            res = Math.max(res,i);
        }
        return res;
    }
}
