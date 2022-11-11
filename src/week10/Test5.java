package week10;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1704. 判断字符串的两半是否相似
 * @date 2022/11/11 02:01:37
 */
public class Test5 {
    public static void main(String[] args) {
        new Test5().halvesAreAlike("book");
    }
    public boolean halvesAreAlike(String s) {
        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2);
        String h = "aeiouAEIOU";
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < a.length(); i++) {
            if (h.indexOf(a.charAt(i)) >= 0) {
                sum1++;
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (h.indexOf(b.charAt(i)) >= 0) {
                sum2++;
            }
        }
        return sum1 == sum2;
    }

}
