package greedyAlgorithm;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 680. 验证回文串 II
 * @date 2023/3/28 20:40:52
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().validPalindrome("aaac"));
    }

    /**
     * 有效回文
     *
     * @param s 年代
     * @return boolean
     */
    public boolean validPalindrome(String s) {
        char[] sc = s.toCharArray();
        int r = sc.length - 1;
        int l = 0;
        int count = 0;
        while (r > l) {
            if (sc[r] == sc[l]){
                r--;
                l++;
            }else {
                return valid(s.substring(l + 1,r+1)) || valid(s.substring(l,r));
            }
        }
        return true;
    }
    public boolean valid(String s) {
        char[] sc = s.toCharArray();
        int r = sc.length - 1;
        int l = 0;
        while (r > l) {
            if (sc[r] != sc[l]){
                return false;
            }
            r--;
            l++;
        }
        return true;
    }
}
