package week9;

import util.SoutUtil;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description KMP 算法 + 动态规划
 * @date 2022/11/3 10:22:38
 */
public class Test5 {
    public static void main(String[] args) {
        String s1 = "abababab";
        String s2 = "abab";
        System.out.println(new Test5().maxRepeating(s1, s2));
    }

    public int maxRepeating(String sequence, String word) {
        int n = sequence.length(), m = word.length();
        if (n < m) {
            return 0;
        }
        int[] fail = new int[m];
        int[] f = new int[n];
        Arrays.fill(fail, -1);
        for (int i = 1; i < m; ++i) {
            int j = fail[i - 1];
            while (j != -1 && word.charAt(j + 1) != word.charAt(i)) {
                j = fail[j];
            }
            if (word.charAt(j + 1) == word.charAt(i)) {
                fail[i] = j + 1;
            }
        }
        SoutUtil.ArrayOut(fail);
        int j = -1;
        for (int i = 0; i < n; ++i) {
            while (j != -1 && word.charAt(j + 1) != sequence.charAt(i)) {
                j = fail[j];
            }
            if (word.charAt(j + 1) == sequence.charAt(i)) {
                ++j;
                if (j == m - 1) {
                    f[i] = (i >= m ? f[i - m] : 0) + 1;
                    System.out.println(i - m);
                    j = fail[j];
                }
            }
        }
        SoutUtil.ArrayOut(f);
        return Arrays.stream(f).max().getAsInt();
    }
}
