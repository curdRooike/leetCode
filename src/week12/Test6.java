package week12;

import util.SoutUtil;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1769. 移动所有球到每个盒子所需的最小操作
 * @date 2022/12/2 08:12:48
 */
public class Test6 {
    public static void main(String[] args) {
        new Test6().minOperations("110");
    }
    /*public int[] minOperations(String boxes) {
        int[] box = new int[boxes.length()];
        for (int i = 0; i < box.length; i++) {
            int sum = 0;
            for (int j = 0; j < boxes.length(); j++) {
                if (boxes.charAt(j) == '1'){
                    sum += Math.abs(i - j);
                }
            }
            box[i] = sum;
        }
        return box;
    }*/
    public int[] minOperations(String boxes) {
        int[] box = new int[boxes.length()];
        int left = boxes.charAt(0) - '0' , right = 0, op = 0;
        for (int i = 1; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '1') {
                right++;
                op += i;
            }
        }
        box[0] = op;
        for (int i = 1; i < boxes.length(); i++) {
            op += left - right;
            if (boxes.charAt(i) == '1') {
                right--;
                left++;
            }
            box[i] = op;
        }
        return box;
    }
}
