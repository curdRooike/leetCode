package week31;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 357. 统计各位数字都不同的数字个数
 * @date 2023/4/27 20:30:29
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println(new Test5().countNumbersWithUniqueDigits(3));
    }
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 10;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + (dp[i - 1] - dp[i - 2]) * (10 - i + 1);
        }
        return dp[n];
    }
}
