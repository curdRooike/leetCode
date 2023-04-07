package week27;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1092. 最短公共超序列
 * @date 2023/3/28 08:32:34
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Test4().shortestCommonSupersequence("abac", "cab"));
    }

    /**
     * 最短普通超层序
     *
     * @param str1 str1
     * @param str2 str2
     * @return {@link String}
     */
    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        str1 = " " + str1; str2 = " " + str2;
        char[] s1 = str1.toCharArray(), s2 = str2.toCharArray();
        int[][] f = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1[i] == s2[j]) f[i][j] = f[i - 1][j - 1] + 1;
                else f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]);
            }
        }
        System.out.println(Arrays.deepToString(f));
        StringBuilder sb = new StringBuilder();
        int i = n, j = m;
        while (i > 0 || j > 0) {
            if (i == 0) sb.append(s2[j--]);
            else if (j == 0) sb.append(s1[i--]);
            else {
                if (s1[i] == s2[j]) {
                    sb.append(s1[i]);
                    i--;
                    j--;
                }else if (f[i][j] == f[i - 1][j]){
                    sb.append(s1[i--]);
                }else {
                    sb.append(s2[j--]);
                }
            }
        }
        return sb.reverse().toString();
    }
}
