package week6;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 459. 重复的子字符串
 * @date 2022/10/16 14:00:50
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().repeatedSubstringPattern("abcabc"));
    }
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i * 2 <= n; ++i) {
            if (n % i == 0) {
                boolean match = true;
                for (int j = i; j < n; ++j) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        return false;
    }
}
