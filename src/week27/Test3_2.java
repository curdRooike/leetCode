package week27;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 718. 最长重复子数组
 * @date 2023/3/27 17:58:26
 */
public class Test3_2 {
    public static void main(String[] args) {
        new Test3_2().findLength(new int[]{1,2,3,2,1},new int[]{3,2,1,4,7});
    }
    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[][] dp = new int[n + 1][m + 1];
        int res = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                res = Math.max(res,dp[i][j]);
            }
        }
        return res;
    }
}
