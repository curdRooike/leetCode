package week26;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1012. 至少有 1 位重复的数字
 * @date 2023/3/20 00:45:59
 */
public class Test3 {
    int[][] dp;
    public static void main(String[] args) {
        System.out.println(new Test3().numDupDigitsAtMostN(20));
    }
    char[] s;

    public int numDupDigitsAtMostN(int n) {
        s = Integer.toString(n).toCharArray();
        int m = s.length;
        dp = new int[m][1 << 10];
        for (int i = 0; i < m; i++)
            Arrays.fill(dp[i], -1); // -1 表示没有计算过
        return n - f(0, 0, true, false);
    }

    int f(int i, int mask, boolean isLimit, boolean isNum) {
        if (i == s.length)
            return isNum ? 1 : 0; // isNum 为 true 表示得到了一个合法数字
        if (!isLimit && isNum && dp[i][mask] != -1)
            return dp[i][mask];
        int res = 0;
        if (!isNum) // 可以跳过当前数位
            res = f(i + 1, mask, false, false);
        int up = isLimit ? s[i] - '0' : 9; // 如果前面填的数字都和 n 的一样，那么这一位至多填数字 s[i]（否则就超过 n 啦）
        for (int d = isNum ? 0 : 1; d <= up; ++d) // 枚举要填入的数字 d
            if ((mask >> d & 1) == 0) // d 不在 mask 中
                res += f(i + 1, mask | (1 << d), isLimit && d == up, true);
        if (!isLimit && isNum)
            dp[i][mask] = res;
        return res;
    }
}
