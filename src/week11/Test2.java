package week11;

import util.SoutUtil;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 859. 亲密字符串
 * @date 2022/11/16 00:02:58
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().buddyStrings("ba", "ab"));
    }
    public boolean buddyStrings(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        if (n != m) {
            return false;
        }
        int count = 0;
        int[] ints = new int[2];
        int[] hash = new int[26];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (count > 1)
                    return false;
                ints[count++] = i;
            }else {
                hash[s.charAt(i) - 'a']++;
            }
        }
        if (s.equals(goal)) {
            for (int i : hash) {
                if (i == 2) {
                    return true;
                }
            }
            return false;
        }
        if (count == 1) {
            return false;
        }
        char[] array = goal.toCharArray();
        char temp = array[ints[0]];
        array[ints[0]] = array[ints[1]];
        array[ints[1]] = temp;
        return String.valueOf(array).equals(s);
    }
}
