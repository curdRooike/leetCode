package week18;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1663. 具有给定数值的最小字符串
 * @date 2023/1/26 14:11:49
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().getSmallestString(3, 27));
    }
    /**
     * 得到最小字符串
     *
     * @param n n
     * @param k k
     * @return {@link String}
     */
    public String getSmallestString(int n, int k) {
        char[] ans = new char[n];
        Arrays.fill(ans, 'a');
        int i = n - 1, d = k - n;
        for (; d > 25; d -= 25) {
            ans[i--] = 'z';
        }
        ans[i] = (char) ('a' + d);
        return String.valueOf(ans);
    }

}
