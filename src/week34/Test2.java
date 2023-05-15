package week34;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1016. 子串能表示从 1 到 N 数字的二进制串
 * @date 2023/5/11 01:59:07
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().queryString("0110", 3));
    }
    public boolean queryString(String S, int n) {
        Set<Integer> seen = new HashSet<>();
        char[] s = S.toCharArray();
        for (int i = 0, m = s.length; i < m; ++i) {
            int x = s[i] - '0';
            if (x == 0) continue; // 二进制数从 1 开始
            for (int j = i + 1; x <= n; j++) {
                seen.add(x);
                if (j == m) break;
                x = (x << 1) | (s[j] - '0'); // 子串 [i,j] 的二进制数
            }
        }
        return seen.size() == n;
    }


}
