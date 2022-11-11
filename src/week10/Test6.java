package week10;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1071. 字符串的最大公因子
 * @date 2022/11/12 02:09:46
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(new Test6().gcdOfStrings("ABCABC", "ABC"));
    }
    public String gcdOfStrings(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        String s1 = str1.concat(str2);
        String s2 = str2.concat(str1);
        if (!s1.equals(s2)) {
            return "";
        }
        int gap = gcd(m, n);
        return str1.substring(0, gap);
    }

    private int gcd(int i, int j) { //求最大公因数
        while (j > 1) {
            int k = i % j;
            i = j;
            j = k;
        }
        if (j == 1) {
            return j;
        } else {
            return i;
        }
    }
}
