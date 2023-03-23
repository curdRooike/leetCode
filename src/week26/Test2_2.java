package week26;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 5. 最长回文子串
 * @date 2023/3/20 12:17:21
 */
public class Test2_2 {
    public static void main(String[] args) {
        System.out.println(new Test2_2().longestPalindrome("babad"));
    }
    // 用于构造最长子串
    int start;
    int len = 0;
    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length() ; i++) {
            func(s, i, i);
            func(s, i,i+1);

        }
        return s.substring(start,start + len);
    }
    public void func(String s,int i, int j){

        while (i >= 0 && j < s.length() &&
                s.charAt(i) == s.charAt(j)){
            if (j - i + 1 > len) {
                start = i;
                len = j - i + 1;
            }
            i--;
            j++;
        }
    }
}
