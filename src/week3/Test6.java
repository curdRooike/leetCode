package week3;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 最长回文串
 * @date 2022/9/25 17:10:47
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(new Test6().longestPalindrome("abbcccccba"));
    }
    public int longestPalindrome(String s) {
        int[] ints = new int[128];
        for (char c : s.toCharArray()) {
            ints[c]++;
        }
        int count = 0;
        for (int i : ints) {
            if (i%2 != 0)
                count++;
        }
        return count == 0 ? s.length() : s.length()-count+1;
    }

}
