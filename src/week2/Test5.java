package week2;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 两个相同字符之间的最长子字符串
 * @date 2022/9/18 00:50:32
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println(new Test5().maxLengthBetweenEqualCharacters("abcsda"));

    }
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] index = new int[26];
        Arrays.fill(index,-1);
        int max = -1;
        for (int i = 0; i < s.length(); i++) {
            if (index[s.charAt(i) - 'a'] < 0) {
                index[s.charAt(i) - 'a'] = i;
            }else {
                max = Math.max(max,i-index[s.charAt(i) - 'a']-1);
            }
        }
        return max;
    }
}
