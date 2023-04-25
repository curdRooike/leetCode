package week30;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1043. 分隔数组以得到最大和
 * @date 2023/4/19 00:54:13
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3().maxSumAfterPartitioning(new int[]{1, 15, 7, 9, 2, 5, 10}
                , 3));
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (i < k){
                max = Math.max(max,arr[i]);
                dp[i] = max * (i + 1);
            }else {
                max = 0;
                for (int j = i; j > i - k; --j){
                    max = Math.max(max, arr[j]);
                    dp[i] = Math.max(dp[i], dp[j - 1] + max * (i - j + 1));
                }
            }
        }
        return dp[n - 1];
    }

}
