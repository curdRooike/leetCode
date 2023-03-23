package week26;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1032. 字符流
 * @date 2023/3/24 00:04:22
 */
public class Test7 {
    public static void main(String[] args) {

    }
}
class StreamChecker {
    static int N = 2010 * 200, idx = 0;
    static int[][] tr = new int[N][26];
    static boolean[] isEnd = new boolean[N * 26];
    StringBuilder sb = new StringBuilder();
    void add(String s) {
        int p = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int u = s.charAt(i) - 'a';
            if (tr[p][u] == 0) tr[p][u] = ++idx;
            p = tr[p][u];
        }
        isEnd[p] = true;
    }
    public StreamChecker(String[] words) {
        for (int i = 0; i <= idx; i++) {
            Arrays.fill(tr[i], 0);
            isEnd[i] = false;
        }
        idx = 0;
        for (String s : words) add(s);

    }

    public boolean query(char c) {
        sb.append(c);
        int n = sb.length(), min = Math.max(0, n - 200), p = 0;

        for (int i = n - 1; i >= min; i--) {
            if (isEnd[p]) return true;
            int u = sb.charAt(i) - 'a';
            if (tr[p][u] == 0) return false;
            p = tr[p][u];
        }
        return isEnd[p];
    }
}