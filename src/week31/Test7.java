package week31;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 796. 旋转字符串
 * @date 2023/4/28 01:17:05
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().rotateString("abcde", "cdeab"));
    }
    public boolean rotateString(String s, String goal) {
        if (s.equals(goal))
            return true;
        for (int i = 0; i < s.length() - 1; i++) {
            s = (s.substring(1) + s.charAt(0));
            //System.out.println(s);
            if ((s).equals(goal)) {
                return true;
            }
        }
        return false;
    }
}
