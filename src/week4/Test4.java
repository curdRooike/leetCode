package week4;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 面试题 01.09. 字符串轮转
 * @date 2022/9/29 10:40:15
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Test4().isFlipedString("aa", "bb"));
    }
    public boolean isFlipedString(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if (m != n) {
            return false;
        }
        if (n == 0) {
            return true;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (s1.charAt((i+j)%n) != s2.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }
}
