package week12;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1796. 字符串中第二大的数字
 * @date 2022/12/3 01:35:50
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().secondHighest("vwkxfq9791769"));
    }
    public int secondHighest(String s) {
        int[] hash = new int[10];
        for (char c : s.toCharArray()) {
            int i = c - '0';
            if (i >= 0 && i <= 9) {
                hash[i]++;
            }
        }
        int  flag = 0;
        for (int i = hash.length-1; i >= 0; i--) {
            if (hash[i] > 0){
                if (++flag >= 2) {
                    return i;
                }
            }
        }
        return -1;
    }
}
