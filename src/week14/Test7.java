package week14;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1750. 删除字符串两端相同字符后的最短长度
 * @date 2022/12/28 15:43:47
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().minimumLength("cabaabac"));
    }
    public int minimumLength(String s) {
        int n = s.length();
        int left = 0;
        int right = n-1;
        while (left < right && s.charAt(left) == s.charAt(right)) {
            char c = s.charAt(left);
            while (left <= right && s.charAt(left) == c) {
                left++;
            }
            while (left <= right && s.charAt(right) == c) {
                right--;
            }
        }
        return right - left +1;
    }
}
