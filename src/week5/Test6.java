package week5;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 387. 字符串中的第一个唯一字符
 * @date 2022/10/8 08:26:01
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(new Test6().firstUniqChar("aabb"));
    }
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i)-'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

}
