package week6;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 392. 判断子序列(db入门)
 * @date 2022/10/10 14:01:06
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().isSubsequence("asc", "adbsec"));
    }
    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        int[][] f = new int[m + 1][26];
        for (int i = 0; i < 26; i++) {
            f[m][i] = m;

        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                if (t.charAt(i) == j + 'a')
                    f[i][j] = i;
                else
                    f[i][j] = f[i + 1][j];
            }
        }
        int add = 0;
        for (int i = 0; i < n; i++) {
            if (f[add][s.charAt(i) - 'a'] == m) {
                return false;
            }
            add = f[add][s.charAt(i) - 'a'] + 1;
        }
        return true;
    }
}
