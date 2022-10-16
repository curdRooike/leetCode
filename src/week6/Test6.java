package week6;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 455. 分发饼干
 * @date 2022/10/15 11:32:23
 */
public class Test6 {
    public static void main(String[] args) {
        int []a = {1,2,3};
        int []b = {1,1};
        System.out.println(new Test6().findContentChildren(a, b));
    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int m = g.length, n = s.length;
        int count = 0;
        for (int i = 0, j = 0; i < m && j < n; i++, j++) {
            while (j < n && g[i] > s[j]) {
                j++;
            }
            if (j < n) {
                count++;
            }
        }
        return count;
    }
}
