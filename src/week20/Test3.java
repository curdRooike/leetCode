package week20;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 344. 反转字符串
 * @date 2023/2/5 00:15:54
 */
public class Test3 {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        new Test3().reverseString(s);
        System.out.println(s);
    }
    public void reverseString(char[] s) {
        int n = s.length;
        for (int left = 0, right = n - 1; left < right; ++left, --right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
        }
    }
}
