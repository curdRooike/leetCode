package week35;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 剑指 Offer II 019. 最多删除一个字符得到回文
 * @date 2023/5/19 11:31:30
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().validPalindrome("deeee"));
    }
    public boolean validPalindrome(String s) {
        int low = 0, high = s.length() - 1;
        while (low < high) {
            char c1 = s.charAt(low), c2 = s.charAt(high);
            if (c1 == c2) {
                ++low;
                --high;
            } else {
                return validPalindrome(s, low, high - 1) || validPalindrome(s, low + 1, high);
            }
        }
        return true;
    }

    public boolean validPalindrome(String s, int low, int high) {
        for (int i = low, j = high; i < j; ++i, --j) {
            char c1 = s.charAt(i), c2 = s.charAt(j);
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }
}
