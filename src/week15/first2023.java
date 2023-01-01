package week15;

import java.util.HashSet;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2351. 第一个出现两次的字母(2023年第一题)
 * @date 2023/1/1 21:21:31
 */
public class first2023 {
    public static void main(String[] args) {
        System.out.println(new first2023().repeatedCharacter("abccbaacz"));
    }
    public char repeatedCharacter(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        char res = ' ';
        for (char c : s.toCharArray()) {
            if (!hashSet.add(c)) {
                res = c;
                break;
            }
        }
        return res;
    }
}
