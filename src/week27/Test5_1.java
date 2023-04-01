package week27;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 312. 戳气球
 * @date 2023/3/29 10:28:06
 */
public class Test5_1 {
    public static void main(String[] args) {
        System.out.println(new Test5_1().maxCoins(new int[]{3, 1, 5, 8}));
    }
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n + 2];
        arr[0] = arr[n + 1] = 1;
        int[][] dp = new int[n + 2][n + 2];
        System.arraycopy(nums, 0, arr, 1, nums.length);
        System.out.println(Arrays.toString(arr));
        for (int len = 3; len <= n + 2; len++) {
            for (int l = 0; l + len -1 <= n + 1; l++) {
                int r = l + len - 1;
                for (int k = l + 1; k <= r - 1; k++) {
                    System.out.print("r:"+r+"\t");
                    System.out.println("l:"+l);
                    System.out.println(arr[r] *
                            arr[l] * arr[k]);
                    dp[l][r] = Math.max(dp[l][r],dp[l][k] + dp[k][r]+ arr[r] *
                            arr[l] * arr[k]);
                }
            }
        }
        return dp[0][n + 1];
    }
}
