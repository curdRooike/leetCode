package week10;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 791. 自定义字符串排序
 * @date 2022/11/13 23:59:45
 */
public class Test57_7 {
    public static void main(String[] args) {
        System.out.println(new Test57_7().customSortString("cba", "abcd"));
    }
    public String customSortString(String order, String s) {
        int[] hash = new int[26];
        for (char c : s.toCharArray()) {
            hash[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : order.toCharArray()) {
           while (hash[c - 'a']-- > 0)
               sb.append(c);
        }
        for (int i = 0; i < 26; i++) {
            while (hash[i]-- > 0) sb.append((char)(i + 'a'));
        }

       return sb.toString();
    }
}
