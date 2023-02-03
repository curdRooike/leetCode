package week19;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2309. 兼具大小写的最好英文字母
 * @date 2023/1/27 02:40:38
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().greatestLetter("arRAzFif"));
    }
    public String greatestLetter(String s) {
        int[] hash = new int[58];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 65]++;
        }
        String a = "";
        for (int i = hash.length-1; i >= 32; i--) {
            if (hash[i] > 0 && hash[i - 32] > 0){
                a = String.valueOf((char) (i - 32 + 65));
                break;
            }
        }
        return a;
    }
}
