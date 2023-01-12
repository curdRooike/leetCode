package week16;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2283. 判断一个数的数字计数是否等于数位的值
 * @date 2023/1/11 00:05:47
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(new Test6().digitCount("1210"));
    }
    public boolean digitCount(String num) {
        int[] res = new int[10];
        for (int i = 0; i < num.length(); i++) {
            int cur = num.charAt(i) - '0';
            res[cur]++;
        }
        for (int i = 0; i < num.length(); i++) {
            int c = num.charAt(i)-'0';
            if(res[i]!=c){
                return false;
            }

        }
        return true;
    }



}
