package week27;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1641. 统计字典序元音字符串的数目
 * @date 2023/3/29 10:01:59
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println(new Test5().countVowelStrings(2));
    }
    public int countVowelStrings(int n) {
        int[] dp = new int[5];
        Arrays.fill(dp,1);
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < 5; j++) {
                dp[j] += dp[j - 1];
            }
        }
        return Arrays.stream(dp).sum();
    }
}
