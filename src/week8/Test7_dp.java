package week8;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 子数组的最小值之和(2022.10.28每日 1 题) dpd打法
 * @date 2022/10/28 16:19:06
 */
public class Test7_dp {
    public static void main(String[] args) {
        int []a = {3,1,2,4};
        System.out.println(new Test7_dp().sumSubarrayMins(a));
    }
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long ans = 0;
        final int MOD = 1000000007;
        Deque<Integer> monoStack = new ArrayDeque<Integer>();
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            while (!monoStack.isEmpty() && arr[monoStack.peek()] > arr[i]) {
                monoStack.pop();
            }
            int k = monoStack.isEmpty() ? (i + 1) : (i - monoStack.peek());
            dp[i] = k * arr[i] + (monoStack.isEmpty() ? 0 : dp[i - k]);
            ans = (ans + dp[i]) % MOD;
            monoStack.push(i);
        }
        return (int)ans;
    }


}
