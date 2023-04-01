package week27;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1638. 统计只差一个字符的子串数目
 * @date 2023/3/27 13:44:34
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3().countSubstrings("abe", "bbc"));
    }

        /*public int countSubstrings(String s, String t) { 暴力枚举
            int m = s.length(), n = t.length();
            int ans = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int flag = 0;
                    for (int k = 0; i + k < m && j + k < n; k++) {
                        flag += s.charAt(i + k) == t.charAt(j + k) ? 0 : 1;
                        if (flag > 1) {
                            break;
                        } else if (flag == 1) {
                            ans++;
                        }
                    }
                }
            }
            return ans;
        }*/


    /*
     * 数子字符串 dp
     *
     * @return int

     */
    public int countSubstrings(String s, String t) {
        int m = s.length(), n = t.length();
        int[][] dpl = new int[m + 1][n + 1];
        int[][] dpr = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dpl[i + 1][j + 1] = s.charAt(i) == t.charAt(j) ? (dpl[i][j] + 1) : 0;
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                dpr[i][j] = s.charAt(i) == t.charAt(j) ? (dpr[i + 1][j + 1] + 1) : 0;
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (s.charAt(i) != t.charAt(j)) {
                    ans += (dpl[i][j] + 1) * (dpr[i + 1][j + 1] + 1);
                }
            }
        }
        return ans;

    }


}