package week32;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1003. 检查替换后的词是否有效
 * @date 2023/5/3 02:47:06
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().isValid("aabcbc"));
    }
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        for (char c : chars) {
            if (c > 'a' && (i == 0 || c - chars[--i] != 1)){
                return false;
            }
            if (c < 'c')
                chars[i++] = c;
        }

        return i == 0;
    }
}
