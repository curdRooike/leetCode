package week37;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2496. 数组中字符串的最大值
 * @date 2023/6/23 16:06:13
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(new Test6().maximumValue
                (new String[]{"alic3", "bob", "3", "4", "00000"}));
    }
    public int maximumValue(String[] strs) {
        int max = 0;
        for (String str : strs) {
            max = Math.max(max, max(str));
        }
        return max;
    }
    private int max(String str){
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) {
                return chars.length;
            }
        }
        return Integer.parseInt(str);
    }
}
