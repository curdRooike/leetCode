package week7;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 482. 密钥格式化
 * @date 2022/10/18 16:39:58
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().licenseKeyFormatting("2-5g-3-J", 2));
    }

    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '-') {
                sb.append(c);
            }
        }
        char[] chars = sb.toString().toCharArray();
        StringBuilder newSb = new StringBuilder();
        int j = chars.length % k;
        for (int i = 0; i < chars.length; i++) {
            if ((j != 0 && j == i) || (i - j != 0 && (i - j) % k == 0)) {
                newSb.append('-');
            }
            newSb.append(chars[i]);
        }
        return newSb.toString().toUpperCase();
    }
}
